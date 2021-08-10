package multithreadingproblems;
import java.util.concurrent.ThreadLocalRandom;
class events{
    static int[] events = new int[1000];
    int randomNum;
    void get_events(){
        for(int i=0; i<1000; i++){
            randomNum = ThreadLocalRandom.current().nextInt(0, 6);
            events[i] = randomNum;  
        }
    }
    void print_events(){
        for(int i=0; i<1000; i++){
            System.out.print(events[i] + " ");
        }
        System.out.println("");
    }
    public synchronized int count(int x){
        int c = 0;
        for(int i=0; i<1000; i++){
            if(events[i] == x){
                c++;
            }  
        }
        return c;
    }
}
class no_event extends Thread{
    events event;
    int c0 = 0;
    no_event(events event){
        this.event = event;
    }
    public void run(){
        int no_reg = event.count(0);
        System.out.println("Not registered: " + no_reg);
    }
}
class event1 extends Thread{
    events event1;
    int c1 = 0;
    event1(events event1){
        this.event1 = event1;
    }
    public void run(){
        int reg1 = event1.count(1);
        System.out.println("Event 1 registrations: " + reg1);
    }
}
class event2 extends Thread{
    events event2;
    event2(events event2){
        this.event2 = event2;
    }
    public void run(){
        int reg2 = event2.count(2);
        System.out.println("Event 2 registrations: " + reg2);
    }
}
class event3 extends Thread{
    events event3;
    event3(events event3){
        this.event3 = event3;
    }
    public void run(){
        int reg3 = event3.count(3);
        System.out.println("Event 3 registrations: " + reg3);
    }
}
class event4 extends Thread{
    events event4;
    event4(events event4){
        this.event4 = event4;
    }
    public void run(){
        int reg4 = event4.count(4);
        System.out.println("Event 4 registrations: " + reg4);
    }
}
class event5 extends Thread{
    events event5;
    event5(events event5){
        this.event5 = event5;
    }
    public void run(){
        int reg5 = event5.count(5);
        System.out.println("Event 5 registrations: " + reg5);
    }
}
public class multithreading2 {
   public static void main(String[] args) throws InterruptedException{
       events e = new events();
       e.get_events();
       e.print_events();
       no_event e0 = new no_event(e);
       e0.start();
       event1 e1 = new event1(e);
       e1.start();
       event2 e2 = new event2(e);
       e2.start();
       event3 e3 = new event3(e);
       e3.start();
       event4 e4 = new event4(e);
       e4.start();
       event5 e5 = new event5(e);
       e5.start();
   }
}


