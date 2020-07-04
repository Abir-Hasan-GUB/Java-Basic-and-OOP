
package OOP.Abstraction;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        MobileUser mu; // reference variable
        
        mu = new Abir();
        mu.call();
        mu.sendMessage();
        
        mu = new Nahid();
        mu.call();
        mu.sendMessage();
   
        
        
    }
}
