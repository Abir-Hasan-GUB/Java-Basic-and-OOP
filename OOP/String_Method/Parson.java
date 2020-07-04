
package OOP.String_Method;

/**
 *
 * @author abirh
 */
public class Parson {
    String name;
    int age;
    
    Parson(String name, int age){
        name = this.name;
        age = this.age;
    }
    
    @Override
    public String toString(){
        return "Name: "+name +"\nAge: "+age;
    }
}
