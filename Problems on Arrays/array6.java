package arrayproblems;
import java.util.Scanner;
public class array6 {
   public static void main(String[] args){
       Scanner scanobj = new Scanner(System.in);
       System.out.println("*****Check if matrix is Identity Matrix*****");
       System.out.println("Enter the dimension of matrix : ");
       int dim = scanobj.nextInt();
       int[][] Diag = new int[dim][dim];
       for (int i=0; i<dim; i++){
           for(int j=0; j<dim; j++){
               System.out.print("\tEnter the element num in row " + (i+1) + " and column " + (j+1) + ": ");
               Diag[i][j] = scanobj.nextInt();
           }
       }
       boolean identity = true;
       for (int i=0; i<dim; i++){
           for (int j=0; j<dim; j++){
               if (i == j){
                   if (Diag[i][j] != 1){
                       identity = false;
                       break;
                   }
               }
               else{
                   if (Diag[i][j] != 0){
                       identity = false;
                       break;
                   }
               }               
               if (!identity)
                   break;
           }                       
       }  
       if (identity)
           System.out.println("\nThe given matrix is an Identity Matrix: ");
       else
           System.out.println("\nThe given matrix is not an Identity Matrix: ");
       for (int i=0; i<dim; i++){
           for(int j=0; j<dim; j++){
               System.out.print(Diag[i][j] + "\t");
           }
           System.out.println("\n");
       } 
   }
}
