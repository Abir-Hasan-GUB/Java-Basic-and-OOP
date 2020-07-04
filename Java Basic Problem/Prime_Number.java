
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Prime_Number {
    public static void main(String[] args) {
        int num,count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if(num % i == 0)
            {
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("It is Not Prime Number");
        }else   
            System.out.println("It is Prime Number");
    }
}
