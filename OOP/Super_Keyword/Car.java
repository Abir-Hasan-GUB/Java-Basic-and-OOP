
package OOP.Super_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class Car extends Vehicle{
    // color, weight, print()
    
    int gear;
    
    Car(String c, double w, int g){
        super(c,w);/*
        At a same time call super class constructor
        bcz parameter name waj same.
        */
        gear = g;
        
    }
    @Override
     void print(){
         super.print();// call super class method
         System.out.println("Gear: "+gear);
    }
     
    
}
