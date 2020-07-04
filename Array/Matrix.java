
package Array;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */
public class Matrix {
    public static void main(String[] args) {
        int [][] A = new int [2][3];
        int [][] B = new int [2][3];
        int [][] C = new int [2][3];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter input for A: "+"\n");
                //Geting input for A:
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("A "+"["+row +"]" +"["+col+"] "+"= ");
               //  System.out.println("A [%d][%d] = ",row,col); Diffrent System for 
               //Getting Input messege...
                A[row][col] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Output of A: "+"\n");
        
                //Output for A:
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        System.out.println("Enter input for B: "+"\n");
                //Geting input for B:
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("B "+"["+row +"]" +"["+col+"] "+"= ");
                B[row][col] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Output of B: "+"\n");
        
                //Output for B:
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(B[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Sum of Matrix A & B: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                // Normal summation form...
                System.out.print("\t" + (A[row][col] + B[row][col]));
            }
            System.out.println();
        }
        
            //Another Way for print Sum of Array: 
        System.out.println("\n Using Another Array to print Sum: \n");
            
            //Adding or Sum of 2 array element:
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col]; // insart sum of 2 array
                // in another one array.
            }
        }
            //Print Final Array:
         for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + C[row][col] );  
            }
             System.out.println();
        }
        
    }
}
