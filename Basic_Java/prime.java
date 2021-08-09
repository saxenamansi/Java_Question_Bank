package basicjava;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start = s.nextInt();
        System.out.print("Enter ending range: ");
        int end = s.nextInt();
        System.out.print("The prime numbers between " +
                start + " and " + end + " are: ");
        for (int i=start; i<=end; i++){
            boolean prime = true;
            for (int j=2; j<=i/2; j++){
                if (i%j == 0){
                    prime = false;
                    break;
                }   
            }
            if(prime){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
