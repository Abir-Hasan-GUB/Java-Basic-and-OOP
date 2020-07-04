
package String;

/**
 *
 * @author Abir Hasan
 */
public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Abir");
        System.out.println("String Buffer is: "+sb);
        
        //Add varitice valu..
        sb.append(" Hasan");
        sb.append(" "+21);
        
        System.out.println("After append string is: "+sb);
        
        // revarge stringBuffer;
        sb.reverse();
        System.out.println("After Revarese: "+sb);
        
        //Delate a charecter from spacific index:
        sb.delete(0, 2);
        System.out.println("After delate: "+sb);
        
        // Set Fixt length for print:
        sb.setLength(5);
        System.out.println("After fixt length string is: "+sb);
        
        
        
    }
}
