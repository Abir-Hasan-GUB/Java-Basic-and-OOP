
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Prime_number_From_M_to_N {
    public static void main(String[] args) {
        int start, end, count = 0,total_prime=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initializaton Number: ");
        start = input.nextInt();
        
        System.out.print("Enter Ending Number: ");
        end = input.nextInt();
        
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i-1; j++) {
                if(i % j == 0)
                {
                     count++;
                break;
                }
                   
            }
            if(count == 0){
                System.out.println(i);
                total_prime++;
            }   
            count =  0;
        }
        System.out.print("Toatal Prime Number is: "+total_prime);
        System.out.println("\n");
    }
    
}