package basicjava;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        if (num%2 != 0){
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }   
    }
}
