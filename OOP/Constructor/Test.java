
package OOP.Constructor;

/**
 *
 * @author Abir Hasan
 */
public class Test { 
    
    public static void main(String[] args) {
        Teacher th1 = new Teacher("Abir Hasan","Male",1774062312);
        Teacher th2 = new Teacher("Nahid Hasan","Male",1521405818);
        Teacher th3 = new Teacher();
        
        th1.displayInfo();
        th2.displayInfo();
        th3.displayInfo();
    }
}
