
package OOP.VarLargs;

/**
 *
 * @author Abir Hasan
 */
public class AddDemo {
    void add(int ... num){/*
        Decler variable lenth args..
        */
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("Sum: "+sum);
    }
}
