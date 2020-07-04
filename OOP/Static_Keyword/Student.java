
package OOP.Static_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class Student {
    String name;
    int id;
    static String University = "GUB";
    
    Student(String n, int i){
        name = n;
        id = i;
    }
    
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University: "+University);
        System.out.println("\n\n");
    }
}
