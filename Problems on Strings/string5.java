package stringproblems;
import java.util.Scanner;
public class string5 {
    public static void main(String[] args){        
        Scanner scanobj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanobj.nextLine();
        char[] chArr = str.toCharArray();
        for(int i=chArr.length-1; i>0; i--){
            boolean repeated = false;
            for(int j=i-1; j>=0; j--){
                if (chArr[i] == chArr[j]) { 
                    System.out.println("Repeated character: " + chArr[i]);
                    repeated = true;
                    break;
                }
            }
            if (!repeated){
                System.out.println("The last non repeated character is: " + chArr[i]);
                break;
            }
        }
    }
}
