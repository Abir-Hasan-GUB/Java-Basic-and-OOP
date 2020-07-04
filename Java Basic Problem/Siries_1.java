
import java.util.Scanner;



/**
 *
 * @author Abir Hasan
 */
public class Siries_1 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        System.out.print("Total Is: "+sum);
        System.out.println("\n");
    }
}
