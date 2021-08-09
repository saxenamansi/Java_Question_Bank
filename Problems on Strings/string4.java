package stringproblems;
import java.util.Scanner;
public class string4 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = scanobj.nextLine();
       String[] tokens = str.split(" ");
       System.out.println("The number of words in the string are: " + tokens.length);
     }
}
