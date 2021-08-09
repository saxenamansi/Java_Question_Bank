package basicjava;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        float height = s.nextFloat();
        System.out.print("Enter your weight in kgs: ");
        float weight = s.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("Your BMI is: " + bmi);
    }
}
