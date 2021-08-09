package arrayproblems;
import java.util.Scanner;
public class array8 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Matrix Addition*****");
       System.out.print("Enter the num of rows in the matrix: ");
       int row = scanobj.nextInt();
       System.out.print("Enter the num of cols in the matrix: ");
       int col = scanobj.nextInt();
       int[][] matA = new int[row][col];
       int[][] matB = new int[row][col];
       int[][] result = new int[row][col];                
       System.out.println("Enter the elements for Matrix A: ");
       for (int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print("\tEnter the element num in row " + (i+1) 
                       + " and column " + (j+1) + ": ");
               matA[i][j] = scanobj.nextInt();
           }
       }
       System.out.println("Enter the elements for Matrix B: ");
       for (int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print("\tEnter the element num in row " + (i+1) 
                       + " and column " + (j+1) + ": ");
               matB[i][j] = scanobj.nextInt();
           }
       }
       for (int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               result[i][j] = matA[i][j] + matB[i][j];
           }
       } 
       System.out.println("The sum of matrix A and matrix B is:");
       for (int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print(result[i][j] + "\t");
           }
           System.out.println("\n");
       }
   }
}
