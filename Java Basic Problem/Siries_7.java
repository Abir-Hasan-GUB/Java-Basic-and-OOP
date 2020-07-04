
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Siries_7 {
    public static void main(String[] args) {
        double n, sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <=n; i=i+1) {
            sum = sum * i;
        }
        System.out.println("Total Is: "+sum);
    }
}
