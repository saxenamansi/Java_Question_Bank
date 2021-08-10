package fileio;
import java.io.*;
class Donor implements Serializable{
    String name;
    int age;
    String address;
    String contact_no;
    String bloodgrp;
    String date;
    public Donor(String name, int age, String address, String contact_no, String bloodgrp, String date) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact_no = contact_no;
        this.bloodgrp = bloodgrp;
        this.date = date;
    }   
    public void print_details(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("Contact No: " + this.contact_no);
        System.out.println("bloodgrp: " + this.bloodgrp);
        System.out.println("date: " + this.date);

    }
}
public class DonorQuestion {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int n = 2;
        Donor[] donors = new Donor[n];
        donors[0] = new Donor("Asmit", 20, "101", "123", "A+", "1st Jan");
        donors[1] = new Donor("Mansi", 21, "102", "456", "B+", "10st Jan");
        File f = new File("LABFAT.txt");
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fo);
        for (int i=0; i<2; i++){
            oos.writeObject(donors[i]);
        }  
        oos.flush();
        oos.close();
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fi);
        for (int i=0; i<2; i++){
            Donor a = (Donor) ois.readObject();
            if ("A+".equals(a.bloodgrp)){
                a.print_details();
                System.out.println("");
                               
            }
        }
    }
}
