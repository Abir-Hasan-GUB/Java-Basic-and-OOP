
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Multiplication_Table {
    public static void main(String[] args) {
        int mul;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number For Mult_Table: ");
        mul = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(mul+ " X " +i +" = " +mul*i);
        }
    }
}
