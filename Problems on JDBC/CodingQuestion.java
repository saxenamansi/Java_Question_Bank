package jdbc;
import java.io.*;
import java.sql.*;
public class JDBC{
  public static void create_table(Connection con){
    try(Statement stmt = con.createStatement();
    ){
      String sql = "create table students ("
      + "name varchar(50) not null,"
      + "image blob not null,"
      + "regno varchar(10) not null,"
      + "city varchar(20) not null,"
      + "company varchar(30) not null,"
      + "salary float not null,"
      + "cgpa float not null"
      + ");";
      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
    }
    catch (SQLException e) {
      System.out.println("Exception in creating database!");
      e.printStackTrace();
    }
  }
  public static void insert_values(Connection con, String name, FileInputStream in, String regno, String city, String company, float salary, float cgpa) throws SQLException{
    PreparedStatement pstmt = con.prepareStatement("INSERT INTO students VALUES(?, ?, ?, ?, ?, ?, ?)");
    pstmt.setString(1, name);
    pstmt.setBlob(2, in);
    pstmt.setString(3, regno);
    pstmt.setString(4, city);
    pstmt.setString(5, company);
    pstmt.setFloat(6, salary);
    pstmt.setFloat(7, cgpa);
    pstmt.execute();
    System.out.println("1 row inserted!");
  }
  public static void retrieve_values(Connection con) throws SQLException, FileNotFoundException, IOException{
    Statement stmt = con.createStatement();
    String sql = "SELECT * FROM students WHERE salary = " + "(SELECT salary FROM students as a ORDER BY salary DESC LIMIT 0,1);";
    ResultSet rs = stmt.executeQuery(sql);
    byte picture[];
    Blob blob;
    int i=1;
    System.out.println("\nThe student with the highest package is: ");
    while(rs.next()){
      System.out.println("\tName: " + rs.getString("name"));
      System.out.println("\tReg Num: " + rs.getString("regno"));
      System.out.println("\tCity: " + rs.getString("city"));
      System.out.println("\tCompany: " + rs.getString("company"));
      System.out.println("\tSalary: " + rs.getFloat("salary"));
      System.out.println("\tCGPA: " + rs.getFloat("cgpa"));
      i++;
      File f = new File("C:\\Users\\HP\\myWebProject\\images\\s" + i + ".jpg");
      FileOutputStream fos = new FileOutputStream(f);
      blob = rs.getBlob("image");
      picture = blob.getBytes(1,(int)blob.length());
      fos.write(picture);
      System.out.println("Image file Saved at : " + f.getAbsolutePath());
      System.out.println();
    }
  }
  public static void main(String[] args) throws SQLException, FileNotFoundException, IOException{
    String url = "****"; # Enter your URL
    String user = "****"; # Enter your username
    String password = "****"; # Enter your password
    Connection con = DriverManager.getConnection(url, user, password);
    create_table(con);
    System.out.println("");
    FileInputStream in1 = new FileInputStream("C:\\Users\\HP\\myWebProject\\images\\s1.jpg");
    FileInputStream in2 = new FileInputStream("C:\\Users\\HP\\myWebProject\\images\\s2.jpg");
    FileInputStream in3 = new FileInputStream("C:\\Users\\HP\\myWebProject\\images\\s3.jpg");
    FileInputStream in4 = new FileInputStream("C:\\Users\\HP\\myWebProject\\images\\s4.jpg");
    FileInputStream in5 = new FileInputStream("C:\\Users\\HP\\myWebProject\\images\\s5.jpg");
    insert_values(con, "Mansi Saxena", in1, "18BCE0307", "Mumbai", "TCS", 500000f, 8.66f);
    insert_values(con, "Raksha Kannu", in2, "18BCE0341", "Coimbatore", "Reliance", 600000f, 8.76f);
    insert_values(con, "Bhargav Roy", in3, "18BCE261", "Kolkata", "Del", 650000f, 9.24f);
    insert_values(con, "Devansh Sharma", in4, "18BCE0255", "Agra", "Cisco", 700000f, 9.30f);
    insert_values(con, "Ayesha Moulana", in5, "18BCE0373", "Chennai", "Deloit", 550000f, 8.36f);
    retrieve_values(con);
  }
}
