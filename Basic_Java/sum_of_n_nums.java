package basicjava;
import java.util.Scanner;
public class sum_of_n_numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int sum = 0;
        for (int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println("The sum of numbers is: " + sum);
    }
}
