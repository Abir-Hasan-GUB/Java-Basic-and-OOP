
package OOP.ExceptionDemo;

/**
 *
 * @author abirh
 */
public class ExceptionDemo {
     public static void main(String[] args) {
        try{    //All code is here if doubt here will be done exepton by users
            int x = 10;
        int y = 0;
        int result = x / y;
        System.out.println("Result is: "+result);
        }catch(Exception e){  // catch execption and display msg for users
            System.out.println("Exception: "+e);
        }
        
        finally{ //if upper alll exception miss any foult but finally alwase print
             System.out.println("Last Line of This Code");
        }
         
        
    }
}
