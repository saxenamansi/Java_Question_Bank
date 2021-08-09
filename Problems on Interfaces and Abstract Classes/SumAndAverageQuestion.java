package interfaceproblems;
interface Numbers{
    void Process(int x,int y);
}
class Sum implements Numbers{
    public void Process(int x,int y){
        int sum = x + y;
        System.out.println("The sum of numbers are: " + sum);
    }
}

class Average implements Numbers{
    public void Process(int x,int y){
        int avg = (x + y)/2;
        System.out.println("The average of numbers are: " + avg);
    }
}

public class interface2 {
   public static void main(String[] args){
       Sum s = new Sum();
       s.Process(10, 20);
       Average a = new Average();
       a.Process(20, 30);
   }
}
