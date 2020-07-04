
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Pattern_1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
                
            }
            System.out.println("\n");
        }
    }
}
