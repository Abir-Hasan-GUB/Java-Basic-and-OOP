
package OOP;

/**
 *
 * @author Abir Hasan
 */
public class Wrapper_Class {
    public static void main(String[] args) {
        //AutoBoxing:
        int x = 10;
        Integer y = Integer.valueOf(x); //" Integer.valuof " na dileo hoi/
                                        //direct y = x; dileo kaj hobe auto
        System.out.println("Y = "+y);
        
        Integer z = x;
        System.out.println("Z = "+z); //without full form
        
        
        //Unboxing:
        Double d = new Double (10.5);
        System.out.println("d = "+d);
        
        double e = d.doubleValue();
        System.out.println("e = "+e);// convert to unboxing direct method
        double f = d;// Sort method of unboxing;
        System.out.println("f = "+f);
        
    }
}
