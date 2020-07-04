
package OOP.LinkdList;

import java.util.LinkedList;

/**
 *
 * @author abirh
 */
public class LinkdListDemo {
    public static void main(String[] args) {
         LinkedList<String> countryName = new LinkedList<String>(); //Create and Declear Linked List....
         
         countryName.add("Bangladesh");  /*
         Initialize data to LinkedList.
         */
         countryName.add("USA");
         countryName.add("Rashia");
         countryName.add("Australia");
         countryName.add(4, "Argentina"); // Insart value use indexing systeme
         countryName.addFirst("My Country"); // initialize data in first array index or linked list
         countryName.addLast("India Foul Country"); // initialize data in Last array index or linked list
         countryName.remove("India Foul Country"); /// Remove exact valu maching system to LinkedList
         countryName.remove(2); /// Remove exact index maching system to LinkedList
         countryName.removeFirst(); /// Remove First element to LinkedList
         countryName.removeLast(); /// Remove Last Element to LinkedList
         
         System.out.println("First Element: "+countryName.getFirst()); // See first element of Linked List
         System.out.println("First Element: "+countryName.getLast()); // See Last element of linked list
         
         countryName.clear();   // Clear Linked List and Totally are Empty....
         System.out.println("After Clear LinkedList: "+countryName);
         
         
         System.out.println(countryName);   // Print LinkedList
         
         for(String a:countryName){ // declear for each loop for print element of linked list
             System.out.println("\t"+a);
             
         }
         System.out.println("Linked List Size: "+countryName.size()); // Link list size
    }
}
