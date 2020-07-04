
package OOP.Encapsulation;

/**
 *
 * @author Abir Hasan
 */
public class EncapTest {
    public static void main(String[] args) {
       Person p1 = new Person();
       p1.setName("Abir Hasan");
        System.out.println("Name: "+p1.getName());
        
        p1.setAge(21);
        System.out.println("Age: "+p1.getAge());
    }
}
