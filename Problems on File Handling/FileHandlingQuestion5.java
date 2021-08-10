package fileio;
import java.io.*;
public class file5 {
   public static void main(String[] args) throws IOException {
       File f = new File("file4b.txt");        
       BufferedWriter bw = new BufferedWriter(new FileWriter(f));
       String text = "Mansi is studying JAVA which has course code CSE1007. \n"
        + "It is a CSE course, hence the code is CSE1007. She enjoys studying JAVA. \n"
               + "JAVA seems like a useful language to her. \n";
       bw.write(text);
       bw.flush();
       bw.close();
       BufferedReader br = new BufferedReader(new FileReader(f));
       String line = "";
       int c1 = 0;
       int c2 = 0;
       System.out.println("");
       PrintWriter pw = new PrintWriter(System.out);
       while((line = br.readLine()) != null){
           if (line.contains("JAVA")){
               c1++;
           }
           if (line.contains("CSE1007")){
               c2++;
           }
           pw.println(line);
       }
       System.out.println("Count of JAVA: " + c1);
       System.out.println("Count of CSE1007: " + c2);
       System.out.println("");
       pw.flush();
       pw.close();
   }
}
