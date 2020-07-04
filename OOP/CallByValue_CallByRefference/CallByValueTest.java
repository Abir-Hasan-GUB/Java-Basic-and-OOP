
package OOP.CallByValue_CallByRefference;

/**
 *
 * @author Abir Hasan
 */
public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println("B Call: "+x);
        
        ob.chenge(x);
        System.out.println("A Call: "+x);
    }
}
