
package OOP;
import java.util.Random;
/**
 *
 * @author Abir Hasan
 */
public class RandomNumber_use_MathClass {
    
    //Use math class for create random number
    
    public static void main(String[] args) {
        double randomNumber = (int) (Math.random()*5)+1;  // "Math" class is double class so do typcost for int.
        
        System.out.println("Random Number: "+randomNumber);
    }
}
