package Number_Conversation;

/**
 *
 * @author Abir Hasan
 */
public class Decimal_to_2_8_16 {

    public static void main(String[] args) {

        //Decimal to Binary:
        int decimal = 10;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary: " + decimal);

        //Decimal to octal:
        decimal = 456235156;
        String octal = Integer.toOctalString(decimal);
        System.out.println("Decimal to Octal: " + decimal);

        //Decimal to Hexadecimal:
        decimal = 125458;
        String hexa = Integer.toHexString(decimal);
        System.out.println("Decimal to Hexa: " + hexa);
    }
}
