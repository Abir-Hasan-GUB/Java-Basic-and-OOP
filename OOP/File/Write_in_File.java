
package OOP.File;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author abirh
 */
public class Write_in_File {
    public static void main(String[] args) {
    
        String id,name;
        int n;
       try{ Formatter writ = new Formatter("C:/Users/abirh/OneDrive - Green University of Bangladesh/Desktop/Abir/Student1.txt");
       
        Scanner input = new Scanner(System.in);
           System.out.print("Enter How Many Input: ");
           n = input.nextInt();
           
           for (int i = 0; i < n; i++) {
               System.out.print("Enter your Student id: ");
               id = input.next();
               name = input.next();
               writ.format("%s %s\r\n",id,name); // Insart Data in file  "\r\n ="return & new line". user input
           }
       
      /* writ.format("%s %s\r\n", "101","Abir Hasan"); // Insart Data in file  "\r\n ="return & new line". pre define
       writ.format("%s %s\r\n", "102","Nahid Hasan");
       writ.format("%s %s\r\n", "103","Najmul Hasan");
       writ.format("%s %s\r\n", "104","Nasir Hasan");
       */
       writ.close(); // close formatter/ "Close Iput data"
    }catch(FileNotFoundException e){
           System.out.println("Exception: "+e);
    }
   }
}
