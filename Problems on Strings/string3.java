package stringproblems;
import java.util.Scanner;
import java.lang.Character;
public class string3 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = scanobj.nextLine();
       int count = 0;
       for (int i=0; i<str.length(); i++){
           char ch = Character.toLowerCase(str.charAt(i));
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               count++;
               System.out.print(str.charAt(i));
           }
       }
       System.out.println("\n");
       System.out.println("Count: " + count);
   }
}

