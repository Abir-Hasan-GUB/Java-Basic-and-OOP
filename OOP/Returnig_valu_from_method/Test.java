
package OOP.Returnig_valu_from_method;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        Returning_value ob1 = new Returning_value();
        int result = ob1.squre(5);
        System.out.println("Squre is: "+result);
         System.out.println("Result is: "+ob1.squre(5));
        int a;
        System.out.print("Enter any Number: ");
        Scanner input = new Scanner(System.in);
        
        
        a = input.nextInt();
        /*
        another system for print
        it is more efficient system of code..
        */
        
        System.out.println("Result is: "+ob1.squre(a));
       
    }
}
