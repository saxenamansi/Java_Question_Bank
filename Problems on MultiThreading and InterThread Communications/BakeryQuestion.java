package interthreadcommunicationproblems;
import java.util.logging.Level;
import java.util.logging.Logger;
class bakery{
    static int cakes = 10;
    synchronized void make_cake() throws InterruptedException{
        while(this.cakes != 0){
            
        }
        synchronized(this){
            notify();
            System.out.println(Thread.currentThread().getName());
            this.cakes += 10;
        }
    }
    synchronized void eat_cake(int num) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());
        System.out.println("Current number of cakes: " + this.cakes);
        System.out.println("Number of cakes ordered: " + num);
        if(num > this.cakes){
            num -= this.cakes;
            this.cakes = 0;
            System.out.println("Cakes have been emptied. \nNumber of cakes "
                    + "still required: " + num);
            synchronized(this){
                wait();
            }
            System.out.println("10 new cakes have been prepared\n\n");
        }
        this.cakes -= num;
        System.out.println("New number of cakes: " + this.cakes);  
        System.out.println("\n");
    }
}
class thread_makecake implements Runnable{
    bakery b;
    thread_makecake(bakery b){
        this.b = b;
    }
    public void run(){
        try {
            b.make_cake();
        } catch (InterruptedException ex) {
            Logger.getLogger(thread_makecake.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}
class thread_eatcake implements Runnable{
    bakery b;
    thread_eatcake(bakery b){
        this.b = b;
    }
    public void run(){
        try{
            b.eat_cake(5);
            b.eat_cake(7);
        } catch (Exception e){
            
        }
    }
}
public class interthread {
   public static void main(String[] args){
       bakery b = new bakery();
       thread_eatcake eat = new thread_eatcake(b);
       thread_makecake make = new thread_makecake(b);
       Thread t1 = new Thread(eat);
       Thread t2 = new Thread(make);
       t1.start();
       t2.start();
   }
}
