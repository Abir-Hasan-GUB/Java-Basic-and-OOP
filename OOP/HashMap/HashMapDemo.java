
package OOP.HashMap;

import java.util.HashMap;

/**
 *
 * @author abirh
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<Integer,String>(); // Create Hash Map
        // Hash map contro 2 method.
        // 1. Put = for insart a value
        // 2. get = for collect a valu which i insart//
        
        customer.put(101, "Abir Hasan");
        customer.put(102, "Nahid Hasan");
        customer.put(103, "Rasel Ahmed");
        customer.put(104, "Azadul Islam");
        
        
        // now wee see customer by using his id
        
        System.out.println(customer.get(101));
    }
}
