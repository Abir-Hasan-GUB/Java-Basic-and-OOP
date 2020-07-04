
package OOP.Inheritance;

/**
 *
 * @author Abir Hasan
 */
public class Test_Iof {
    public static void main(String[] args) {
        Animal a = new Animal();
        Person_Iof p = new Person_Iof();
        Teacher_Iof t = new Teacher_Iof();
        
        System.out.println(a instanceof Animal); //true
        System.out.println(p instanceof Animal);//true
        System.out.println(t instanceof Person_Iof);//true
        System.out.println(t instanceof Animal);//true
        System.out.println(p instanceof Teacher_Iof);//false
        
    }
}
