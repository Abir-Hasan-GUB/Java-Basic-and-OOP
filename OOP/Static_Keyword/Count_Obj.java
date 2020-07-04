
package OOP.Static_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class Count_Obj {
   static int count = 0;/*
   Static use korci bcz normally count korle 
   obj gulo alada alada jaiga nei tai static 
   use korte hoi jate same jaiga ke bar bar 
   reffer kore and count er man bare...
   */
    
    Count_Obj(){
        count++;
    }
    
    void display(){
        System.out.println("Total Count: "+count);
    }
}
