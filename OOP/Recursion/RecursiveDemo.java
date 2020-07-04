
package OOP.Recursion;

/**
 *
 * @author Abir Hasan
 */
public class RecursiveDemo {
    int fact(int n){
        if(n == 1)
            return 1;
        else
        return n * fact(n-1);
    }
}
