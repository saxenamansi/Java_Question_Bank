package objectorientedproblems;
import java.util.Scanner;
class TestDetails{
    Scanner ip = new Scanner(System.in);
    float[][] m = new float[5][];
    public void storemarks(int id, int not){
        m[id] = new float[not];
        for(int t=0; t<not; t++){
            System.out.print("Enter marks in test-"+(t+1)+": ");
            m[id][t] = ip.nextFloat();
        }
    }public void display(){
        for(int s=0; s<5; s++){
            System.out.print("Student-"+(s+1)+"-------: ");
            for(int t=0; t<this.m[s].length; t++)
            System.out.print(m[s][t]+" ");
            System.out.println();
        }
    } 
}class NoticePeriod extends TestDetails{
    int noss = 0;
    public void notice(){
        for(int id=0; id<5; id++){
            int mtf=0, t=super.m[id].length-1;
            while(t>=0 && mtf<3){
                if(super.m[id][t] >= 50){
                    mtf++;
                }t--;
            }if(mtf < 3){
                noss++;
                System.out.println("Student "+(id+1)+" hasn't scored >=50 in "
                        + "minimum 3 tests.");
                System.out.println();
            }
        }
    }public int rnos(){
        return noss;
    }
}public class objects1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NoticePeriod n = new NoticePeriod();
        for(int i=0; i<5; i++){
            System.out.print("Enter no. of test taken by student "+(i+1)+": ");
            int not = s.nextInt();
            n.storemarks(i, not);
        }n.display();
        n.notice();
        System.out.println(n.rnos()+" students have been notified.");
    }
}
