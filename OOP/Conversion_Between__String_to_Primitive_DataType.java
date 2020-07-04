
package OOP;

/**
 *
 * @author Abir Hasan
 */
public class Conversion_Between__String_to_Primitive_DataType {
    public static void main(String[] args) {
        // Primitive to String
        
        double x = 10.25;
        String i = Double.toString(x);
        System.out.println("i = "+i);
        
        // String To Primitive:
        String st = "32";
        int d = Integer.valueOf(st);
        System.out.println("d = "+d);
        
        /// Another methode of convert string to primitive
        String ss = "15.2";
        double dd = Double.parseDouble(ss);
        System.out.println("dd = "+dd);
        
        //Primitive to string;
        int m = 10;
        String b = Integer.toString(m);
    }
}
