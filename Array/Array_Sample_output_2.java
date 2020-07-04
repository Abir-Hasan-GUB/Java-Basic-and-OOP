
package Array;

/**
 *
 * @author Abir Hasan
 */
public class Array_Sample_output_2 {
    /**
     * Simple Output is:
     * 0
     * 1    2
     * 3    4   5
     * 7    8   9   10
     */
    
    public static void main(String[] args) {
        int A [][] = new int [4][]; // Create and Decler Array (2D) without size
                                    //of Column.
        A[0] = new int [1]; // Decler particuler size of column.
                            //Here, A[0] = first row.
                            //Here,int[1] = decler column for row 1.
        A[1] = new int [2];
        A[2] = new int [3];
        A[3] = new int [4];
        
        // Insarting or Geting input for array.
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                A[row][col] = k;
                k++;
            }
        }
        // Print Array: 
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    }
}
