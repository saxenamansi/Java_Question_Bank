package multithreadingproblems;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class MyException extends Exception{
    public MyException(String s){
        System.out.println("Exception: " + s);
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("The following numbers have their sum of digits as a factor");
        for(int n=100; n<=200; n++){
            int sum = 0;
            int a = n;
            while(a>0){
                sum += a%10;
                a/=10;
            }
            if(n%sum == 0){
                System.out.println(n + "\tSum: " + sum);
            }
            try {
                if(n%10 == 0)
                    Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("The following numbers have their sum of digits as a prime number");
        for(int n=1; n<=100; n++){
            int sum = 0;
            int a = n;
            while(a>0){
                sum += a%10;
                a/=10;
            }
            boolean prime = true;
            for(int i=2; i<=sum/2;i++){
                if(sum%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(n + "\tSum: " + sum);
            }  
            try {
                if(n%10 == 0)
                    Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}
public class multithreading3 {
    public static void main(String[] args) throws MyException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 100 - 200");
        int num = s.nextInt();
        if(num<100 | num>200){
            throw new MyException("Number is not in accepted range");
        }
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
