
package OOP.Polymorphism;

/**
 *
 * @author Abir Hasan
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
         p.display();/*
         First e p refarence hisebe
         kaj kortece person class er
          hoiye.
         */
         
         p = new Teacher();
         p.display();/*
         Then p akn kaj kortece teacher
         class er reffarence hisebe
         */
         
         p = new Student();/*
         akn p kaj kortece student class
         er reffarence variable hisebe
         */
         p.display();
        
    }
}
