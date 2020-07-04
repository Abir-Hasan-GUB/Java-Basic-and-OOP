
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Pattern_4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) 
            { // Logic of Space print.(space = n - row);              
                System.out.print(" ");              //Space Print
            }
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(col); 
            }
            System.out.print("\n");
            
        }
    }
}
