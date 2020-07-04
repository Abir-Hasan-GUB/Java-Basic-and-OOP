
package Array;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */
public class Matrix_Sum_of_Upper_Lower_Diagonal_Element_Sum {
    public static void main(String[] args) {
        
        //Diclaretion:
        int [][] A = new int [3][3];
        int upper_element_sum = 0;
        int lower_element_sum = 0;
        int diagonal_element_sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        //Getting User Input:
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("A " +"["+row+"]"+"["+col +"]" +"= ");
                A[row][col] =  input.nextInt();
            }
        }
        System.out.println();
        
        //Print Matrix:
        System.out.println("Matrix is: \n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" +A[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        // Find sum of Diagonal,Upper,Lower Element:
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // Check for Upper Element
                if(row == col)
                {
                    diagonal_element_sum = diagonal_element_sum + A[row][col];
                }
                if(col > row){
                    upper_element_sum = upper_element_sum + A[row][col];
                }
                if(row > col){
                    lower_element_sum = lower_element_sum + A[row][col];
                }
                    
            }
        }
        // Print All Value:
        System.out.println("Sum of Diagonal Element: "+diagonal_element_sum);
        System.out.println("Sum of Upper Element: "+upper_element_sum);
        System.out.println("Sum of Lower Element: "+lower_element_sum);
    }
}
