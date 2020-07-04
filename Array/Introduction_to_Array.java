
package Array;

/**
 *
 * @author Abir Hasan
 */
public class Introduction_to_Array {
    public static void main(String[] args) {
        int [] number;      // Diclar Array
        number = new int [5]; // Crate Array
        
        number[0] = 10;
        number[1] = 10;
        number[2] = 10;
        number[3] = 10;
        number[4] = 10;
        
        // Find Sum 
        int sum = number[0] + number[1]+ number[2] + number[3] + number[4];
        System.out.print("Sum is: "+sum);
        System.out.println();
        // Find Size.
        int len = number.length;
        System.out.print("Array Length is: "+len);
        System.out.println();
    }
}
