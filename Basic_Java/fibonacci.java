package basicjava;
import java.util.Scanner;
public class fibonacci {
    public static int fib(int n){
        if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        if(n==0 || n==1){
            System.out.println("The nth term of the fibonacci series"
                    + " where n is " + n + " : " + 1);
        }
        else{
            int f = fib(n);
            System.out.println("The nth term of the fibonacci series"
                    + " where n is " + n + " : " + f);
        }
        
    }
}
