
package String;

/**
 *
 * @author Abir Hasan
 */
public class String_Palindrom {
    public static void main(String[] args) {
        String s = "MAM";
        
        //String has no revarse methode so we use string buffer method
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        
        // chck main and reverse:
        if(s.equals(sb)){
            System.out.println("Palindrom");
        }else
            System.out.println("Not Palindrom");
    }
}
