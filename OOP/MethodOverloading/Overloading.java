
package OOP.MethodOverloading;

/**
 *
 * @author Abir Hasan
 */
public class Overloading {
    void abir(int n, int m){
        System.out.println("First Method: ");
        System.out.println("N = "+n);
        System.out.println("M = "+m);
    }
    void abir(double n, double m){
        System.out.println("\n\nSecond Method: ");
        System.out.println("N = "+n);
        System.out.println("M = "+m);
    }
    void abir(int n, String name, double cgpa){
        System.out.println("\n\nThird Method: ");
        System.out.println("ID: "+n);
        System.out.println("Name : "+name);
        System.out.println("CGPA : "+cgpa);
    }
    void abir(String name){
        System.out.println("\n\nForth Method: ");
        System.out.println("Name: "+name);
    }
}
