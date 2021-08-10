package fileio;
import java.io.*;
public class File2 {
   public static void main(String[] args) throws IOException {
       File f = new File("file2.txt");        
       BufferedWriter bw = new BufferedWriter(new FileWriter(f));
       String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       bw.write(alphabets);
       bw.flush();
       bw.close();
       BufferedReader br = new BufferedReader(new FileReader(f));
       String line = "";
       while((line = br.readLine()) != null){
           System.out.println(line);
       }
       System.out.println(f.getAbsolutePath());
   }
}
