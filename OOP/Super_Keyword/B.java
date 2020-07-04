
package OOP.Super_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class B extends A{
    
    B(){
        /*
        For call constructor 
        does not need dot oparetor
        */
        super (); // Call Super class constructor.
        System.out.println("Constructor of B");
    }
     
    // x = 10; ( Hide )
    // display1 (Hidden Method)
    int x = 5;
    
    void display(){
        /*
        use super keyword for 
        call super class variable.
        */
        System.out.println("X = "+super.x);
    }
    
    @Override
    void display1(){
        /*
        Now use super keyword in 
        override method ("If isn't Override
        method then not nessesary to
        use super keyword") to call 
        super class method
        */
        
        super.display1();
        
        System.out.println("Inside B Class");
    }
}
