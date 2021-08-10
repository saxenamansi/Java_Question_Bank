package multithreadingproblems;
class print{
    public void print_nums(int a, int b, int odd){
        if(odd == 0){
            System.out.println("Printing even numbers");
            if(a%2 != 0)
                a++;
            for(int i=a; i<=b; i=i+2){
                System.out.println(i);
            }
        }else{
            System.out.println("Printing odd numbers");
            if(a%2 == 0)
                a++;
            for(int i=a; i<=b; i=i+2){
                System.out.println(i);
            }
        }
    }
}class myThread1 extends Thread{
    print p;
    myThread1(print p){
        this.p = p;
    }
    public void run(){
        p.print_nums(10, 30, 0);        
    }
}class myThread2 extends Thread{
    print p;
    myThread2(print p){
        this.p = p;
    }
    public void run(){
        p.print_nums(40, 60, 1);
    }
}public class multithreading1 {
   public static void main(String[] args){
       System.out.println("Mansi Saxena");
       System.out.println("18BCE0307");
       print p = new print();
       myThread1 t1 = new myThread1(p);
       myThread2 t2 = new myThread2(p);
       t1.start();
       t2.start();
   }
}
