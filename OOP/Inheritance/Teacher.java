
package OOP.Inheritance;

/**
 *
 * @author Abir Hasan
 */
public class Teacher extends Person{
    /*
    Name, age , diplay1() in this class.
    */
    String qualification;
    
    void display2(){
        display1();
        System.out.println("Qualification: "+qualification);
    }
}
