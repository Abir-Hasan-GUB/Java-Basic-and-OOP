
package OOP.ExceptionDemo;

import java.util.Scanner;

/**
 *
 * @author abirh
 */
public class ExceptionProblem {
    public static void main(String[] args) {
      
        int count = 1;  // break condition of tarminate program
        
        do{
              try{
            int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number: X = ");
        x = input.nextInt();
        System.out.print("Enter Any Number: Y = ");
        y = input.nextInt();
        
        int result = x / y;
        System.out.println("Result is: "+result);
        count = 2; // if count is upgrade and is 2 then program will be break
           
        }catch(Exception e){
            System.out.println("Exception is: "+e);
             System.out.println("Please input proper int number, and try again...");
        }
        }while(count == 1); // this program is running untill wrong input...
    }
}
