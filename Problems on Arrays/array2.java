package arrayproblems;
import java.util.Scanner;
public class array2 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Search for a number*****");
       System.out.print("Enter size of the array: ");
       int n = scanobj.nextInt();
       int[] search_arr = new int[n]; 
       for(int i=0; i<n; i++){
           System.out.print("\tEnter value for index " + i +" : ");
           search_arr[i] = scanobj.nextInt();
       }
       boolean found = false;
       int index = 0;
       System.out.print("Enter the number to be searched: ");
       int search = scanobj.nextInt();
       for (int i=0; i<n; i++){
           if (search_arr[i] == search){
               found = true;
               index = i;
               break;
           }
       }
       if (found){
           System.out.println("The keyword " + search + " was found in index number " + index);
       }
       else{
           System.out.println("The keyword " + search + " was not found!");
       }   
   }
}
