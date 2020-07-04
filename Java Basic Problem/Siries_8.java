
import java.util.Scanner;



/**
 *
 * @author Abir Hasan
 */
public class Siries_8 {
    public static void main(String[] args) {
        int n, sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i=i+1) {
            sum = sum * (i*i);
        }
        System.out.println("Total Is: "+sum);
    }
}
