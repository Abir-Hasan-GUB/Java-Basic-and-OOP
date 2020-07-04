
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Pattern_5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");    // print Space
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");    // print Space
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
