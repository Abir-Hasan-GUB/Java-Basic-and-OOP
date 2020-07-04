
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Revarge_a_Number {
    public static void main(String[] args) {
        int num, sum = 0, temp, remainder;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        temp = num;
        
        while   (temp != 0){
            remainder = temp % 10;
            sum = sum * 10 + remainder;
            temp = temp / 10;
        }
        System.out.println("Revarse Number is: "+sum);
        System.out.println("\n");
    }
}
