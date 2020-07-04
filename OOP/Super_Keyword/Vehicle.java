
package OOP.Super_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class Vehicle {
    String color;
    double weight;
    
    Vehicle (String c, double w){
        color = c;
        weight = w;
    }
    void print(){
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}
