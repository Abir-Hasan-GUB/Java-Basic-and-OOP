
package String;

/**
 *
 * @author Abir Hasan
 */
public class String_Part_3 {
    public static void main(String[] args) {
        String s1 = "    I love my country    "; // Declear String
        String s2 = "Nahid";
        
        // Trim Space of a string ( From first and Last Site)
        String s3 = s1.trim();
        System.out.println("String 1 is: "+s1);
        System.out.println("After Trim string Is: "+s3);
        
        // Print a charecter from a String use index number:
        char s4 = s2.charAt(0); // Here use "char" bcz perticular 
                                //Charecter is Char data type dont String.
        System.out.println("Charecter of s2 & Index 0 is: "+s4);
        
        // Convert a charecter from a string to Assci valu:
        int a = s2.codePointAt(0); //Convert to Assci valu
        System.out.println("After conver Assci valu of N is: "+a);
        
        // Find index of any any charecter:
        int b = s2.indexOf("N");
        System.out.println("Index number of N in S2 is: "+b);
        
        //Find last index number of Any Charecter:
            b = s2.lastIndexOf("d");
            System.out.println("Index number of d in S2 is: "+b);
            
    }
}
