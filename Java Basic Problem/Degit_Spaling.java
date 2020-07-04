
import java.util.Scanner;


/**
 *
 * @author Abir Hasan
 */

public class Degit_Spaling {
    public static void main(String[] args) {
     int degite;
     Scanner input = new Scanner(System.in);
        System.out.print("Enter any Degite: ");
     degite = input.nextInt();
     
     switch (degite) {
         case 0:
             System.out.println("Zero");
             break;
         case 1:
             System.out.println("One");
             break;
         case 2:
             System.out.println("Two");
             break;
         case 3:
             System.out.println("Three");
             break;
         case 4:
             System.out.println("Four");
             break;
         default:
             System.out.println("Not a degit");
     }
     
    }
}
