package module2;
import java.util.Scanner;
interface Exam{
    public float Pass();
}
interface Classify{
    public String Average(float total);
}
class Result implements Exam, Classify{
    public float Pass(){
        Scanner s = new Scanner(System.in);
        float[] marks = new float[5];
        for(int i=1; i<=5; i++){
            System.out.print("Enter marks for subject " + i + " : ");
            marks[i-1] = s.nextInt();
        }
        float total = 0;
        for(int i=0; i<5; i++){
            total += marks[i];
        }
        return total;
    }
    public String Average(float total){
        double avg = total/5;
        System.out.println("Average: " + avg);
        if(avg>=60)
            return "First";
        else if (avg>= 50)
            return "Second";
        else if(avg<50)
            return "No division";
        return null;
    }
}
public class lab_inheritance {
   public static void main(String[] args){
       Result obj = new Result();
       float total = obj.Pass();
       System.out.println("Division: " + obj.Average(total));
   }
}
