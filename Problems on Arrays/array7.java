package arrayproblems;
import java.util.Scanner;
public class array7 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Matrix Multiplication*****");
       System.out.println("Enter the num of rows in the matrix X: ");
       int row_x = scanobj.nextInt();
       System.out.println("Enter the num of cols in the matrix X: ");
       int col_x = scanobj.nextInt();
       int row_y = col_x;
       System.out.println("Enter the num of cols in the matrix Y: ");
       int col_y = scanobj.nextInt();
       int[][] matX = new int[row_x][col_x];
       int[][] matY = new int[row_y][col_y];
       int[][] product = new int[row_x][col_y];                
       System.out.println("Enter the elements for Matrix X: ");
       for (int i=0; i<row_x; i++){
           for(int j=0; j<col_x; j++){
               System.out.print("\tEnter the element num in row " + (i+1) + " and column " + (j+1) + ": ");
               matX[i][j] = scanobj.nextInt();
           }
       }
       System.out.println("Enter the elements for Matrix Y: ");
       for (int i=0; i<row_y; i++){
           for(int j=0; j<col_y; j++){
               System.out.print("\tEnter the element num in row " + (i+1) + " and column " + (j+1) + ": ");
               matY[i][j] = scanobj.nextInt();
           }
       }
       for (int i=0; i<row_x; i++){
           for(int j=0; j<col_y; j++){
               for(int k=0; k<row_y; k++)
                   product[i][j] += matX[i][k] * matY[k][j];
           }
       }
       System.out.println("The product of the two matrices are: ");
       for (int i=0; i<row_x; i++){
           for(int j=0; j<col_y; j++){
               System.out.print(product[i][j] + "\t");
           }
           System.out.println("\n");
       } 
   } 
}
