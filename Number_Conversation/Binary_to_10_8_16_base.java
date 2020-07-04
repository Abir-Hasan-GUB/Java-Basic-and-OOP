
package Number_Conversation;

/**
 *
 * @author Abir Hasan
 */
public class Binary_to_10_8_16_base {
    public static void main(String[] args) {
        //Binary to Decimal:
        
        String binary = "10101010101010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal is: "+decimal);
        
        //Octal to Decimal:
        String octal = "5674";
        Integer Decimal = Integer.parseInt(octal, 8);
        System.out.println("Octal to Decimal is: "+Decimal);
        
        //HexaDecimal to Decimal:
        String Hexa = "AF";
        Integer DDecimal = Integer.parseInt(Hexa, 16);
        System.out.println("Hexa to Decimal is: "+DDecimal);
    }
}
