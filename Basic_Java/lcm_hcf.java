package basicjava;
import java.util.Scanner;
public class lcmhcf {
    public static void main(String[] args){
        Scanner scanobj = new Scanner(System.in);
        System.out.println("*****LCM and HCF*****");
        System.out.println("Enter the two numbers: ");
        int a = scanobj.nextInt();
        int b = scanobj.nextInt();
        int hcf = 1;
        for(int i=2; i<=a; i++){
            if ((a%i == 0) && (b%i == 0)){
                hcf = i;
            }
        }
        System.out.println("HCF is: " + hcf);
        int lcm = a*b/hcf;
        System.out.println("LCM is: " + lcm);
    }
}
