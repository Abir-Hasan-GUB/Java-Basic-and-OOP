
package OOP.String_Comparism;

/**
 *
 * @author abirh
 */
public class A {
    public static void main(String[] args) {
        String a = "Abir Hasan";
        String b = "Abir Hasan";
        
        boolean m = (a == b);
        System.out.println("Result: "+m);
        
        B ob1 = new B();
        C ob2 = new C();
        
       boolean max = ob1.equals(ob2);
        System.out.println("Max: "+max);
        ob2.equals(ob1);
    }
}
