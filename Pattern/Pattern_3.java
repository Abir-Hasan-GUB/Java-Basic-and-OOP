
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Pattern_3 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Eny Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.print("\n");
        }
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.print("\n");
        }
    }
}
