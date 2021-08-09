package arrayproblems;
import java.util.Scanner;
public class array4 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Find 2nd largest and 2nd smallest value in array*****");
       System.out.print("Enter size of the array: ");
       int n = scanobj.nextInt();
       int[] arr = new int[n]; 
       for(int i=0; i<n; i++){
           System.out.print("\tEnter value for index " + i +" : ");
           arr[i] = scanobj.nextInt();
       }
       int min = arr[0];
       int max = arr[0];
       int min2 = arr[0];
       int max2 = arr[0];
       for(int i=0; i<n; i++){
           if (arr[i]<min){
               min = arr[i];
           }
           if (arr[i]>max){
               max = arr[i];
           }                    
       }
       for(int i=0; i<n; i++){
           if (arr[i]<min2 && arr[i]!=min){
               min2 = arr[i];
           }
           if (arr[i]>max2 && arr[i]<max){
               max2 = arr[i];
           }
       }
       System.out.println("The second largest number is: "+ max2 + " and \nthe second smallest number is " + min2);      
   }           
}
