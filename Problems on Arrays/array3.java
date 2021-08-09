package arrayproblems;
import java.util.Scanner;
public class array3 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Remove duplicate values*****");
       System.out.print("Enter size of the array: ");
       int n = scanobj.nextInt();
       int[] original = new int[n]; 
       for(int i=0; i<n; i++){
           System.out.print("\tEnter value for index " + i +" : ");
           original[i] = scanobj.nextInt();
       }
       int count = 0;
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if (original[i]==original[j] && original[i]!= 'x'){
                   original[j] = 'x';
                   count++;
               }
           }
       }
       int k = 0;
       int[] final_arr = new int[n-count];
       for(int i=0; i<n; i++){
           if(original[i]!='x'){
               final_arr[k++] = original[i];
           }
           
       }
       for (int i = 0; i < final_arr.length; i++)
           System.out.print(final_arr[i] + " ");
       System.out.println();     
   }
}
