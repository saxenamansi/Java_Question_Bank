package fileio;
import java.io.*;
class MyInfo implements Serializable{
    String name;
    String regno;
    String phoneno;
    String branch;
    String hobby;
    String favplace;
    String favfood;
    float cgpa;
    public MyInfo(String name, String regno, String phoneno, String branch, String hobby, String favplace, String favfood, float cgpa) {
        this.name = name;
        this.regno = regno;
        this.phoneno = phoneno;
        this.branch = branch;
        this.hobby = hobby;
        this.favplace = favplace;
        this.favfood = favfood;
        this.cgpa = cgpa;
    } 
    public void print_info(){
        System.out.println("");
        System.out.println("Name: " + this.name);
        System.out.println("Reg no: " + this.regno);
        System.out.println("Phone no: " + this.phoneno);
        System.out.println("Branch: " + this.branch);
        System.out.println("Hobby: " + this.hobby);
        System.out.println("Fav Place: " + this.favplace);
        System.out.println("Fav Food: " + this.favfood);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("");
    }
}
public class File4 {
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       MyInfo my_info = new MyInfo("Mansi Saxena", "18BCE0307", "7977991374", "CSE", "Dance", "Mumbai", "Biryani", 8.53f);
       MyInfo bestf_info = new MyInfo("Devansh Sharma", "18BME0030", "9987065439", \"Mech", "Cricket", "Agra", "Pizza", 8.89f);
       File f1 = new File("file4a_myinfo.txt");
       FileOutputStream fo1 = new FileOutputStream(f1);
       ObjectOutputStream oos1 = new ObjectOutputStream(fo1);
       oos1.writeObject(my_info);
       oos1.flush();
       oos1.close();
       System.out.println(f1.getAbsolutePath());
       File f2 = new File("file4a_bestfinfo.txt");
       FileOutputStream fo2 = new FileOutputStream(f2);
       ObjectOutputStream oos2 = new ObjectOutputStream(fo2);
       oos2.writeObject(bestf_info);
       System.out.println(f2.getAbsolutePath());
       oos2.flush();
       oos2.close();
       FileInputStream fi1 = new FileInputStream(f1);
       ObjectInputStream ois1 = new ObjectInputStream(fi1);
       MyInfo a1 = (MyInfo) ois1.readObject();
       a1.print_info();
       FileInputStream fi2 = new FileInputStream(f2);
       ObjectInputStream ois2 = new ObjectInputStream(fi2);
       MyInfo a2 = (MyInfo) ois2.readObject();
       a2.print_info();      
   }
}
