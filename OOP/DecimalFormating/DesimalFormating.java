
package OOP.DecimalFormating;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author abirh
 */
public class DesimalFormating {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Double Number: ");
         x = input.nextDouble();
         
        DecimalFormat ob = new DecimalFormat("0.00");//Decler Decimal Format Classs and Initialaze paramiter size.
       
        System.out.println("Finally Double number is: "+ob.format(x));
        
    }
}
