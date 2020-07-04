
package Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Abir Hasan
 */
public class Array_List_Demo_3 {
    public static void main(String[] args) {
        ArrayList <Integer> man1 = new ArrayList<>();//Decler ArrayList/
    ArrayList <Integer> man2 = new ArrayList<>();//Decler ArrayList/
    ArrayList <Integer> man3 = new ArrayList<>();//Decler ArrayList/
    
    // Adding elemnt in array list:
    man1.add(10);
    man1.add(20);
    man1.add(30);
    
    man2.add(3);
    man2.add(2);
    man2.add(1);
    
    //Print Array List:
        System.out.println("ArrayLIst_1 = "+man1);
        System.out.println("ArrayLIst_2 = "+man2);
        
        // Check Equality between two arrayList:
        boolean x = man1.equals(man2);
        System.out.println("Is man1 & Man2 is equal: "+x);
        
        //Sort an array list;
        Collections.sort(man2);
        System.out.println("After Sort 2nd Array List is: "+man2);
        
        //Revarge an array list::
        Collections.sort(man1,Collections.reverseOrder());
        System.out.println("After Reverse List 1 is: "+man1);
        
        //Copy all element to another list:
        man3.addAll(man2);
        System.out.println("3rd ArrayList is: "+man3);
        System.out.println();
        
    }
   
}
