
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */
public class Armstrong_Number_1_to_100 {
    public static void main(String[] args) {
        int num, r, sum=0, m, n, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start Number: ");
        m = input.nextInt();
        System.out.print("Enter End Number: ");
        n = input.nextInt();
       
        
        for (int i = m; i <= n; i++) {
            temp = i;               // put valu of 'i' in temp
            while(temp > 0){        //program run until mod of temp == 0 
                r = temp % 10;
                sum = sum + (r*r*r);
                temp = temp / 10;
               
            }
            if(sum == i)
            {
                System.out.println(i +" ");
            }
            sum  = 0;    // Sum = 0 for new value check for 'i' again.
        }
    }
}