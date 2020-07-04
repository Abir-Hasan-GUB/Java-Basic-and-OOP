
package OOP.Overloading_Constructor;

/**
 *
 * @author Abir Hasan
 */
public class Teacher {
    
    String name, gander;
    int phone;
    
     Teacher(){
         System.out.println("No Information");
     } 
     
     Teacher(String n, String g){
         name = n; 
         gander = g;
     } 
     
     Teacher(String n, String g, int p){
         name = n;
         gander = g;
         phone = p;
     } 
     
     void displayInformation(){
         System.out.println("Name: "+name);
         System.out.println("Gander: "+gander);
         System.out.println("Phone: "+phone);
         System.out.println("\n\n");
     }
}
