package stringproblems;
import java.util.Scanner;
import java.lang.Character;
public class string2 {
   public static void main(String[] args) {
       Scanner scanobj = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = scanobj.nextLine();
       System.out.print("The answer is: ");
       for (int i=0; i<str.length(); i++){
           if (i%2 == 0){
               System.out.print(Character.toUpperCase(str.charAt(i)));
               continue;
           }
           System.out.print(str.charAt(i));
       }
       System.out.println("\n");
   }
}
