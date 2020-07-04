
package OOP.AutomaticTypeConversion;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        AutoTypeConvert ob = new AutoTypeConvert();
        
        ob.abir(10, 20);
        /*
        This number is auto converted
        into double type and pass to
        method
        */
        
        ob.abir(181, "Abir Hasan", 3.344);
        
    }
}
