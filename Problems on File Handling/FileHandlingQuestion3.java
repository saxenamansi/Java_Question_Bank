package fileio;
import java.io.*;
class application implements Serializable{
    String name;
    String address;
    String phoneno;
    String services;
    application(String name, String address, String phoneno, String services){
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.services = services;
    }
    void print_details(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone number: " + this.phoneno);
        System.out.println("Services: " + this.services);
    }
}
public class File3 {
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       application dealer = new application("Vijay", "15 Rose", "7977991374", "delivery");
       File f = new File("file3.txt");
       FileOutputStream fo = new FileOutputStream(f);
       ObjectOutputStream oos = new ObjectOutputStream(fo);
       oos.writeObject(dealer);
       oos.flush();
       oos.close();
       FileInputStream fi = new FileInputStream(f);
       ObjectInputStream ois = new ObjectInputStream(fi);
       application a = (application) ois.readObject();
       a.print_details();
   }    
}
