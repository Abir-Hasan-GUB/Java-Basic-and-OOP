
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Pattern_11 {
    public static void main(String[] args) {
        int n, count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(++count +" ");
            }
            System.out.println();
        }
    }
}
