
package Array;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */

/**
 * Sample matrix is:
 *  0   1   2   3   4
 *  5   6   7   8   9
 *  10  11  12  13  14
 *  15  16  17  18  19
 */


public class Array_Sample_output_1 {
    public static void main(String[] args) {
        int [][] A = new int [4][5];
        Scanner input = new Scanner (System.in);
        /// Getting User Input:
        System.out.println("Enter Your Matrix: ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("A " +"["+row+"]"+"["+col +"]" +"= ");
                A[row][col] = input.nextInt();
            }
        }
        
        //Print Given Matrix:
        System.out.println();
        System.out.println("Matrix is: ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
    }
}
