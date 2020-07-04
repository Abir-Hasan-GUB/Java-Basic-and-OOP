
package OOP.Static_Blook;

/**
 *
 * @author Abir Hasan
 */
public class StaticBlock {
   static String Name;
   static int num;
    
    static{
        Name = "Abir Hasan";
        num = 101;
    }
    
   static void display(){
       System.out.println("Name: "+Name);
       System.out.println("Num: "+num);
   }
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
