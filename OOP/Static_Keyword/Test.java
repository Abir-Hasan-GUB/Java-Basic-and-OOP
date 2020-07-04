
package OOP.Static_Keyword;

import java.util.Scanner;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter information for Std 1: ");
        Student obj1 = new Student(input.next(),input.nextInt());
               obj1.displayInfo();
               
        System.out.println("Enter information for Std 1: ");
        Student obj2 = new Student(input.next(),input.nextInt());
        obj2.displayInfo();
        
        System.out.println("Enter information for Std 1: ");
        Student obj3 = new Student(input.next(),input.nextInt());
        obj3.displayInfo();
    }
}
