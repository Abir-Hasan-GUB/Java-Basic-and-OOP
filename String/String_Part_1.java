
package String;

/**
 *
 * @author Abir Hasan
 */
public class String_Part_1 {
    public static void main(String[] args) {
        String str1 = new String("Abir Hasan"); // String Decler + Initialazation
        String str2 = new String("ABIR Hasan"); // String Decler + Initialazation
        System.out.println("String Is: "+str1);
        int a = str1.length();
        System.out.println("Length of String 1: "+a);
        
        //Compaere two string/
        boolean c = str1.equals(str2);
        System.out.println("String 1 & 2 is Equal: "+c);
        if(str1 == str2){  // This system is not apropait for compare.
                          // It is wrong way. and give wrong answer
            System.out.println("Equal");
        }else
            System.out.println("Not Equal");
        
        // Compare with "contains" command
        if(str1.contains(str2))
        {
            System.out.println("String is Match");
        }else
            System.out.println("Not Match");
        
        // String compaere with ignore case/
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("String is Match by Ignor Case");
        }else
            System.out.println("Not Match by Ignor Case");
        
        // Check A string is empty or not:
        
        boolean e = str1.isEmpty();
        System.out.println("String 1 is: "+e);
        
    }
}
