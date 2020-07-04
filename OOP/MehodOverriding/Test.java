
package OOP.MehodOverriding;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        
        p.name = "Abir Hasan";
        p.age = 21;
        
        t.Qualification = "BSC in CSE";
        t.age = 22;
        t.name = "Nahid Hasan";
        t.display();
        p.display();
    }
}
