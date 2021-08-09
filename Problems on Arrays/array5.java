package arrayproblems;
import java.util.Arrays;
import java.util.Scanner;
public class array5 {
    public static int[] negate(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n; i++){
            if(arr[i]%2 != 0){
                arr[i] = -arr[i];
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scanobj = new Scanner(System.in);
        System.out.println("*****Array Manipulation*****");
        System.out.print("Enter size of the array: ");
        int n = scanobj.nextInt();
        int[] original = new int[n]; 
        for(int i=0; i<n; i++){
            System.out.print("\tEnter value for index " + i +" : ");
            original[i] = scanobj.nextInt();
        }
        int[] arr = negate(original);
        Arrays.sort(arr);
        arr = negate(arr);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }   
}
