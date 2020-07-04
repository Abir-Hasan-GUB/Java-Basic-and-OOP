
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Sum_of_Degit {
    public static void main(String[] args) {
        int num, sum = 0, temp,remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        num =  input.nextInt();
        temp = num;
        while(temp != 0)   {
            remainder = temp % 10;
            sum = sum + remainder;
            temp  = temp / 10;
        }
        System.out.print("Sum of Degit is: "+sum);
        System.out.println("\n");
    }
}
