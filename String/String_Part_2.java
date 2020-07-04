
package String;


public class String_Part_2 {
    public static void main(String[] args) {
        String s1 = "Abir"; //String Declear
        String s2 = "Hasan";
        
        String s3 = s1.concat(" "+s2);
        System.out.println("After Concat: "+s3);
        
        //Convert to UpperCase:
        System.out.print("After Uppercase of s1: ");
        System.out.print(s1.toUpperCase()); // use "toLowerCase" fo convert
                                            // Lower Case
        System.out.println();
        
        // Check a string start with fixt string or not:
        boolean c = s1.startsWith("A");
        System.out.println("String 1 start with fixt charecter: "+c);
        // Check a string start with fixt string or not:
        
         c = s1.endsWith("r");
        System.out.println("String 1 start with fixt charecter: "+c);
    }
}
