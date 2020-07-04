
package OOP.File;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author abirh
 */
public class ReadFrom_A_File {
    public static void main(String[] args) {
        try{
            File file = new File("C:/Users/abirh/OneDrive - Green University of Bangladesh/Desktop/Abir/Student1.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                
                System.out.println("ID: "+id + " Name: "+name);
            }
            
            scanner.close();
            
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
