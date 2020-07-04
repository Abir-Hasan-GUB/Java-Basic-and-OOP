
import java.util.Scanner;



/**
 *
 * @author Abir Hasan
 */
public class Pattern_10 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col == 1 || col == row || row == n){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
