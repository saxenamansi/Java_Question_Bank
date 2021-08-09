package arrayproblems;
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
  public static void main(String[] args) {
    Scanner scanobj = new Scanner(System.in);
    System.out.println("*****Sort N Numbers*****");
    System.out.print("Enter size of the array: ");
    int n = scanobj.nextInt();
    int[] sort_arr = new int[n];
    for(int i=0; i<n; i++){
      System.out.print("\tEnter value for index " + i +" : ");
      sort_arr[i] = scanobj.nextInt();
    }
    Arrays.sort(sort_arr);
    System.out.println("\nSorted array");
    for (int i = 0; i < sort_arr.length; ++i)
      System.out.print(sort_arr[i] + " ");
    System.out.println();
  }
}
