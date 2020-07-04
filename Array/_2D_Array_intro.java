
package Array;

/**
 *
 * @author Abir Hasan
 */
public class _2D_Array_intro {
    public static void main(String[] args) {
        int [][] num = new int [2][3]; // Create and Declear 2D array
        
        num [0][0] = 10;
        num [0][1] = 20;
        num [0][2] = 30;
        num [1][0] = 40;
        num [1][1] = 50;
        num [1][2] = 60;
       
        // Print Data of Array using Primitive System....
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);
        
         System.out.println();
        
        // Print Data of Array using Loop....
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
