
import java.util.Scanner;
/**
 *
 * @author Abir Hasan
 */
public class Print_Sum_Of_m_to_n {
    public static void main(String[] args) {
        int m,n,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for M: ");
        m = input.nextInt();
        
        System.out.println("Enter number for N: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
