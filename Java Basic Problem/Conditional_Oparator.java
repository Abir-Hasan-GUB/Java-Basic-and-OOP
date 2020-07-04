
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Conditional_Oparator {
    public static void main(String[] args) {
        int num1,num2,large;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any Two Number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
       large = (num1 > num2) ? num1 : num2;
       
        System.out.println("Large Number is: "+large);
    }
}
