package abstractclassproblem;
abstract class special{
    abstract public double process(double P,double R); 
}
class Discount extends special{
    public double process(double P,double R){
        System.out.println("The principal is: " + P);
        System.out.println("The rate is " + R);
        double net = P + P*R/100;
        System.out.println("The total value is: " + net);
        return net;
    }
}
public class abstractclass {
    public static void main(String[] args){
        Discount dobj = new Discount();
        dobj.process(1000.0d, 0.055d);
    }  
}

