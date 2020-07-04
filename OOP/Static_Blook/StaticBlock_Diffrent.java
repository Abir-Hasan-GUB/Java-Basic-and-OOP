
package OOP.Static_Blook;

/**
 *
 * @author Abir Hasan
 */
public class StaticBlock_Diffrent {
    
   static String name;
    static{
        System.out.println("Static Part");
        /*
        Static part age print hoi 
        main method er age
        */
        name = "Abir Hasan";
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticBlock_Diffrent.display();
    }
    
   static void display(){
       System.out.println("Name: "+name);
   }
 }
