package basicjava;
import java.util.Scanner;
public class grades {
    public static void main(String[] args){
        System.out.println("*****GRADES*****");
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter the following marks: ");
        System.out.print("\tMaths (M): ");
        int math = scanobj.nextInt();
        System.out.print("\tPhysics (P): ");
        int phy = scanobj.nextInt();
        System.out.print("\tChemistry (C): ");
        int chem = scanobj.nextInt();
        System.out.print("\tEnglish (E): ");
        int eng = scanobj.nextInt();
        System.out.print("\tComputer Science (CS): ");
        int cs = scanobj.nextInt();
        float overall_avg = (math + phy + chem + eng + cs)/5;
        float engg_avg = ((math*2) + phy + chem)/4;
        float cs_avg = cs;

        if (overall_avg>75 && cs_avg>engg_avg)
            System.out.println("Probable Mech, Civil, EEE, ECE Candidate");
        if (overall_avg>75 && engg_avg>cs_avg)
            System.out.println("Probable CSE, IT, IS Candidate");
        if (overall_avg<75 && cs_avg>engg_avg)
            System.out.println("Probable BCA Candidate");
        if (overall_avg<75 && engg_avg>cs_avg)
            System.out.println("Probable BSc Candidate");
    }
}
