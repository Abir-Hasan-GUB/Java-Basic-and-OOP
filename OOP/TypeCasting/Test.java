
package OOP.TypeCasting;

/**
 *
 * @author abirh
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Teacher();// Up Casting
        
        p.display();
        
        Teacher t = (Teacher) new Person();// Down Casting.
        t.display();
    }
}
