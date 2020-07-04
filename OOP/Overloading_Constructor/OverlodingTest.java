
package OOP.Overloading_Constructor;

/**
 *
 * @author Abir Hasan
 */
public class OverlodingTest {
    public static void main(String[] args) {
        Teacher th1 = new Teacher();
        Teacher th2 = new Teacher("Abir Hasan","Male");
        Teacher th3 = new Teacher("Rasel Ahmed","Male",1754);
        
        
        /*
        Print all
        */
        
        th1.displayInformation();
        th2.displayInformation();
        th3.displayInformation();
    }
}
