
package OOP;

import java.util.Random;

/**
 *
 * @author Abir Hasan
 */
public class Random_Number {
    //use random class;
    
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(4)+1;
        System.out.println("Random Number: "+randomNumber);
        
    }
}
