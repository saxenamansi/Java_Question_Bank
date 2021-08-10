package fileio;
import java.io.*;
public class File1 {
   public static void main(String[] args) throws FileNotFoundException, IOException {     
       File fr = new File("file_read1.txt");
       FileOutputStream fo = new FileOutputStream(fr);
       String text = "Hey! How are you?";
       fo.write(text.getBytes());
       fo.close();
       FileInputStream fi = new FileInputStream(fr);
       File fw = new File("file_write1.txt");
       int size = (int) fr.length();
       byte[] b = new byte[size];
       fo = new FileOutputStream(fw);
       for(int i=size-1; i>=0; i--){
           byte br = (byte) fi.read();
           b[i] = br;
       }
       fo.write(b);
       fo.close();
       System.out.println(fr.getAbsolutePath());
   }
}
