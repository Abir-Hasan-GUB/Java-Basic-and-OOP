
package OOP.File;

import java.io.File;

/**
 *
 * @author abirh
 */
public class FileDemo {
    public static void main(String[] args) {
       // File dir = new File("Abir");// file (Foldar) decler and set name 
        
        //// Note: this folder only create your project file.
        // if you create this another space like desktop you can flow second step
        
       // dir.mkdir(); // create finally directory / folder
        
        File folder = new File ("C:/Users/abirh/OneDrive - Green University of Bangladesh/Desktop/Abir"); // Here double "\\" back slash some time 
        // doesn't work so use forward single slash
        folder.mkdir();
        
        String m = folder.getAbsolutePath(); // see location of created file/
        System.out.println("Location is: "+m);
        System.out.println("Folder name: "+folder.getName()); // see directory  name; 
        
       /*if(folder.delete()){  // Delate created folder/ directory
           System.out.println(folder.getName()+"Folder Hasa been Delated...");
       }*/
        
       
       ///////////Create File //////
       
       File file1 = new File("C:/Users/abirh/OneDrive - Green University of Bangladesh/Desktop/Abir/Student1.txt"); //file decler
       File file2 = new File(m+"/Student2.txt");//use path finder 
       // function then created file simply/
       
       try{
           file1.createNewFile();
           file2.createNewFile();
           System.out.println("File are created...");
           
       }catch(Exception e){
           System.out.println("e");
       }
        
        //Check file are exist or note..
        
       
        
        if(file1.exists() && file2.exists()){
            System.out.println("File are exist...");
        }else{
            System.out.println("File Note Exist...");
        }
        
         file2.delete(); // File is delated...
         if(file2.exists()){
             System.out.println("Check Existents..");
         }else{
             System.out.println("File-2 is deleted");
         }
    }
}
