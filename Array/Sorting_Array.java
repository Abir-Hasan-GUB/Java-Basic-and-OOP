
package Array;

import java.util.Arrays;

/**
 *
 * @author Abir Hasan
 */
public class Sorting_Array {
    public static void main(String[] args) {
        int [] number =  {1,2,-1,6,7,8,9,0,10}; 
        // Sorting Array using Default Class of Java .
        Arrays.sort(number);
        
        System.out.print("Ascending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        
        // Descending Array using Reverse roule...
        System.out.print("Decendig: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] +" ");
        }
        System.out.println();
        
        String [] name = {"Nahid","Mim","Abir"};
        //Sorting Array Using Default Class of Java
        Arrays.sort(name);
        System.out.print("Ascending of String: ");
        // Print:
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] +" ,");
        }
        System.out.println();
        
        // Desending print string list: 
        
        System.out.print("Descending of String: ");
        for (int i = name.length-1; i >= 0; i--) {
            System.out.print(name[i] +" ,");
        }
        System.out.println();
    }
}
