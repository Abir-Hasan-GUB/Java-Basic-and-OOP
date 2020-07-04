
package Array;

import java.util.ArrayList;

/**
 *
 * @author Abir Hasan
 */
public class Array_List_Demo_2 {
    public static void main(String[] args) {
        ArrayList <Integer> number1 = new ArrayList<>();//Decler ArrayList/
        ArrayList <Integer> number2 = new ArrayList<>();//Decler ArrayList/
        ArrayList <Integer> number3 = new ArrayList<>();//Decler ArrayList/
        
        // Adding Element in ArrayList _ 1:
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        //Adding Element in ArrayList _ 2:
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        
        // Print ArrayList:
        System.out.println("1st _ Array List Is: "+number1);
        System.out.println("2nd _ Array List Is: "+number2);
        
        //Check An Array list is empty or  not:
        boolean x = number1.isEmpty();
        System.out.println("Check Array List 1 is empty: "+x);
        
        //Check an element containt or not//
        boolean y = number1.contains(10);
        System.out.println("Is 10 is containts in number1: "+y);
        
        //Check index number of any elemnt in array list...
        int z = number1.indexOf(20);
        System.out.println("Index of 20 is: "+z);
        
        //replace an element in array list:
        number1.set(3, 50);
        System.out.println("After Replace array list is: "+number1);
        
        //Geting an array from array list:
        int d = number1.get(3);
        System.out.println("Getting array for index 3 = "+d);
        
        System.out.println();
        
    }
}
