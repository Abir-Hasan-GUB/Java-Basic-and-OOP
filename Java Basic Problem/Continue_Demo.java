

/**
 *
 * @author Abir Hasan
 */
public class Continue_Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i=i+3) {
            if(i==6)
                continue;       // Skip Value of 6 because i == 6.
            System.out.println(i);
        }
    }
}
