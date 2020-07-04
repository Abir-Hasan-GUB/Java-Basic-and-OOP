
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Fibonacci_Series {
    public static void main(String[] args) {
        int n,first=0,second=1,fibo;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        System.out.print(first+ " " +second);
        
        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            System.out.print(" "+fibo +" ");
            first = second;
            second = fibo;
        }
         System.out.println("\n");
    }
}
