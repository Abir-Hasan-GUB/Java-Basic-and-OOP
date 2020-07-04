
package String;

/**
 *
 * @author Abir Hasan
 */
public class String_Part_4 {
    public static void main(String[] args) {
        String s = "Abir Hasan";
        // Replace charecter using condition
        
        String c = s.replace('a', 'A'); // Here 2nd replace by 1st charecter;
        System.out.println("After Replace: "+c);
        
        
        // Split a string/
        System.out.println("After Split string are: ");
        String [] s1 = s.split(" ");
        for (String x : s1) {
            System.out.println(x);
        }
    }
}
