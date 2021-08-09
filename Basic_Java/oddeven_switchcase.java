package basic java;
import java.util.Scanner;
public class odd_even {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = s.nextInt();
    int check = num%2;
    switch(check){
      case 0:
        System.out.println("The number is even");
        break;
      case 1:
        System.out.println("The number is odd");
        break;
    }
  }
}
