
package OOP.Constructor;

/**
 *
 * @author Abir Hasan
 */
public class Teacher {
     String name,gander;
    int phone_number;
    Teacher(){
        System.out.println("No value");
    }
    
    Teacher(String n, String g, int ph){
            /*
        Constructor has no data type
        Constructor is same as Class name
        */
        name = n;
        gander = g;
        phone_number = ph;
    }
    
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gander: "+gander);
        System.out.println("Phone: "+phone_number);
        System.out.println("\n\n");
    }
}
