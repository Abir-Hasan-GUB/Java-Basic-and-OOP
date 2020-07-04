
package OOP.Class;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();// object decler and create
        
        teacher1.gender = "Male";
        teacher1.name = "Abir Hasan";
        teacher1.phone_number = 1774062312;
        
        /*
        print all for teacher 1:
        */
        System.out.println("Name: "+teacher1.name);
        System.out.println("Gander: "+teacher1.gender);
        System.out.println("Phone_N: "+teacher1.phone_number);
        /*
        Another object create and initialization and print:
        */
        Teacher teacher2 = new Teacher();// object decler and create
        
        teacher2.gender = "Female";
        teacher2.name = "Sabikun Nahar Tanha";
        teacher2.phone_number = 1521405818;
        
        /*
        print all for teacher 1:
        */
        System.out.println();
        System.out.println();
        
        
        System.out.println("Name: "+teacher2.name);
        System.out.println("Gander: "+teacher2.gender);
        System.out.println("Phone_N: "+teacher2.phone_number);
        
    }
}
