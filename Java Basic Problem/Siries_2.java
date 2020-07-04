
import java.util.Scanner;



/**
 *
 * @author Abir Hasan
 */
public class Siries_2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i=i+2) {
            sum = sum + i;
        }
        System.out.println("Total Is: "+sum);
    }
}
