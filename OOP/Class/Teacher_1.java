
package OOP.Class;

/**
 *
 * @author Abir Hasan
 */
public class Teacher_1 {
    String name, gander;
    int phone_number;
    
    void setInformation(String n,String g, int ph){
        name = n;
        gander = g;
        phone_number = ph;
    }
    void desplayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gander: "+gander);
        System.out.println("Phone Number: "+phone_number);
        System.out.println("\n");
    }
}
