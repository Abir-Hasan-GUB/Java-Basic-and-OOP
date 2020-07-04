
package Array;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */
public class Find_Sum_and_Avarage {
    public static void main(String[] args) {
        int [] number = new int [5];
        System.out.println("Enter Your Input: ");
        Scanner input = new Scanner (System.in);
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();    // Input array value
        }
        
        for (int i = 0; i < 5; i++) {
            sum = sum + i;
        }
        System.out.print("Sum Is: "+sum);
        System.out.println();
        System.out.print("Avarage is: "+sum / number.length);
        System.out.println();
    }
}
