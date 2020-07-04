
package OOP.CallByValue_CallByRefference;

/**
 *
 * @author Abir Hasan
 */
public class CallByReffTest {
    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "ABIR Hasan";
        
        System.out.println("Befor call: "+r1.name);
        
        r1.chang(r1);
        System.out.println("After call: "+r1.name);
    }
}
