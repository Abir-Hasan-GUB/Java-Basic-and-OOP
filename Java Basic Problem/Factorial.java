
import java.util.Scanner;



/**
 *
 * @author Abir Hasan
 */
public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int i = n; i >=1; i--) {
            fact = fact * i;
        }
        System.out.println("Total Is: "+fact);
    }
}
