package stringproblems;
import java.util.Scanner;
public class string1 {
   public static void main(String[] args) {
       Scanner scanobj = new Scanner(System.in);
       boolean mob = true ;
       boolean reg = true;
       System.out.print("Enter your Registration Number: ");
       String regno = scanobj.nextLine();
       System.out.print("Enter your Mobile Number: ");
       String mobileno = scanobj.nextLine();        
       if (regno.length() != 9){
           System.out.println("Error! Please enter a Registration Number of length 9");
           reg = false;
       }if (mobileno.length() != 10){
           System.out.println("Error! Please enter a Mobile Number of length 10");
           mob = false;
       }if(mob){
           for (int i=0; i<mobileno.length(); i++){
               if (!(mobileno.charAt(i)>='0' && mobileno.charAt(i)<='9')){
                   mob = false;
                   break;
               }
           }
       }if(reg){
           for (int i=0; i<regno.length(); i++){
               char c = regno.charAt(i);
               if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')){
                   reg = false;
                   break;
               }
           }
       }if (reg){
           System.out.println("The Registration Number is valid");
       }else{
           System.out.println("The Registration Number is invalid");
       }if (mob){
           System.out.println("The Mobile Number is valid");
       }else{
           System.out.println("The Mobile Number is invalid");
       }
   }
}
