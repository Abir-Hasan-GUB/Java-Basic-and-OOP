
/**
 *
 * @author Abir Hasan
 */
public class Bitwise_Oparetor {
    public static void main(String[] args) {
        int a = 32, b = 16, c;
        c = a>>2;
        System.out.println("a >> 2 : "+c);
        c = b<<3;
        System.out.println("a << 3 : "+c);
        c = a^2;
        System.out.println("a ^ 2 : "+c);
        c = a&b;
        System.out.println("a & 2 : "+c);
    }
}
