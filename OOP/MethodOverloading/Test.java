
package OOP.MethodOverloading;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        Overloading ob = new Overloading();
        
       
        ob.abir(10, 20);
        ob.abir(2.5, 3.5);
         ob.abir("Abir Hasan");
        ob.abir(181, "Abir Hasan", 3.344);
        
    }
}
