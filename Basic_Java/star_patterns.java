package basicjava;
import java.util.Scanner;
public class JavaLab2 {
    public static void main(String[] args) {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("*****STAR PATTERNS*****");
        System.out.print("Enter the num of columns: ");
        int n = scanobj.nextInt();

        //first pattern
        System.out.println("Pattern 1 :");
        for (int i = 0; i < n; i++) {
            for (int star = 0; star < i + 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        //second pattern
        System.out.println("Pattern 2 :");
        for (int i = 0; i < n; i++) {
            for (int star = 0; star < n - i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Pattern 3 :");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (2 * i - 2); j < (2 * n - 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
