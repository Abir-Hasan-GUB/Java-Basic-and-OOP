

/**
 *
 * @author Abir Hasan
 */
public class Break_and_Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i=i+3) {
            if(i==10)
                continue;
           
            if(i>13)
                break;
             System.out.println(i);
        }
    }
}