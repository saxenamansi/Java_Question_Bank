package interfaceproblems;
interface gcd{
    int computeGCD(int num1, int num2);
}
class APPROACH1 implements gcd{
    public int computeGCD(int num1, int num2){
        if (num1 == 0)
            return num2;
        return computeGCD(num2%num1, num1);
    }
}
class APPROACH2 implements gcd{
    public int computeGCD(int num1, int num2){
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        return gcd;
    }
}
public class interface3 {
   public static void main(String[] args){
       APPROACH1 a1 = new APPROACH1();
       System.out.println(a1.computeGCD(14, 42));
       APPROACH2 a2 = new APPROACH2();
       System.out.println(a2.computeGCD(7, 42));
   }
}
