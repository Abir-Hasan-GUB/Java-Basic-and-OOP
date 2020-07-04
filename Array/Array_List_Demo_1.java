
package Array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Abir Hasan
 */
public class Array_List_Demo_1 {
    
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList <> (); //Decler Array List.
        // Find Array_List Size...
        int a = number.size();
        System.out.print("Array_List Size before adding: "+a);
        System.out.println();
        
        // Adding Value in Array_List...
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
       number.add(4, 50); // Add value with index number in Array_List...
       
       // After Adding Array_List Size is: 
       a = number.size();
        System.out.print("After Adding Array Size is: "+a);
        System.out.println();
        
       // Print ArrayLIst.....
        System.out.print("Array_List is: (For_Each Loop):: ");
       for(int x : number){         //Useing ForEach Loop...
           System.out.print(x +" ");
       }
        System.out.println();
        
        // Normal Print Array_List....
        System.out.print("Normal Print: (Array_List):: ");
        System.out.println(number +" ");
        
        // Print use Iterator:...
        Iterator itr = number.iterator(); // Decler Iterator...
        // Now use While loop for print Array_List;
        System.out.print("Array_List Print: (Use Iterate:: )");
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        
        // Normally We use For_Each Loop...
        
        // Remove a element from Array_List:
        number.remove(4); // Remove an element use "remove" commend/
        
        a = number.size(); //After one remove item cheak size of list.
        System.out.print("After one element remove size is: ");
        System.out.print(a);
        System.out.println();
        
        System.out.print("After Remove one Element: Array_List is:: ");
        System.out.print(number); //Print After Remove one element.
        System.out.println();
        
        //Remove all element from Array_List:
        number.removeAll(number);
        System.out.print("After Remove all Element Array_List Is: ");
        System.out.print(number);
        System.out.println();
        
        a = number.size(); //After remove all item cheak size of list.
        System.out.print("After all element remove size is: ");
        System.out.print(a);
        
        System.out.println();
    }
}
