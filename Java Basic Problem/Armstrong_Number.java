
import java.util.Scanner;
/**
 *
 * @author Abir Hasan
 */
public class Armstrong_Number {
    public static void main(String[] args) {
        int num, remainder, temp, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp != 0){
            remainder = temp % 10;
            sum = sum + (remainder*remainder*remainder);
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Armstrong Number");
        }else
            System.out.println("Not Armstrong Number");
    }
}
