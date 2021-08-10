package exceptionhandlingproblems;
import java.util.Scanner;
public class exception1 {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number: \n 1 for ArithmeticException\n 2 for NullPointerException\n 3 for ArrayIndexOutOfBoundsException");
       int i = s.nextInt();
       if(i==1){
           try{
               throw new ArithmeticException("throw Arithmetic Exception");
           } catch (ArithmeticException e){
               System.out.println(e);
               System.out.println("Arithmetic Exception was thrown, caught and handled");
           }
       } 
       else if (i==2){
           try{
               throw new NullPointerException("throw NullPointer Exception");
           } catch(NullPointerException e){
               System.out.println(e);
               System.out.println("NullPointer Exception was thrown, caught and handled");
           }
       }
       else if(i==3){
           try{
              throw new ArrayIndexOutOfBoundsException("throw ArrayIndexOutOfBounds Exception"); 
           } catch (ArrayIndexOutOfBoundsException e){
               System.out.println(e);
               System.out.println("ArrayIndexOutOfBounds Exception was thrown, caught and handled");
           }
       }
       System.out.println("\n");
       System.out.println("Code continues running without interruption");
   }      
}
