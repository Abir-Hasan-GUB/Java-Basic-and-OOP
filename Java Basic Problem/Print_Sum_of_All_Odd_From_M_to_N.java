
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Print_Sum_of_All_Odd_From_M_to_N {
      public static void main(String[] args) {
        int m,n,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for M:");
        m = input.nextInt();
        System.out.println("Enter number for N:");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            if(i % 2 != 0)
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
