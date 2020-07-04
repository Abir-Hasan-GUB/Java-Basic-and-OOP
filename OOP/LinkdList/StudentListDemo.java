
package OOP.LinkdList;

import java.util.LinkedList;

/**
 *
 * @author abirh
 */
public class StudentListDemo {
    public static void main(String[] args) {
        //create linked list using defult system + use reffer classs as a data type
        LinkedList<Student> list = new LinkedList<Student>();
        
        //Student List create use Student class and obj...
        
        Student s1 = new Student(181002,"Abir Hasan","BSC");
        Student s2 = new Student(181003,"Nahid Hasan","MBBS");
        Student s3 = new Student(181004,"Rasel Ahmed","BSC");
        Student s4 = new Student(181005,"Azadul Islam","BSC");
        
        // Now Add all student to the student list....
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        /// Now Print all list or Display our list:
        
        for(Student s: list){ // Use for each loop for print
            System.out.println(s.id+" "+s.Name+" "+s.className);
        }
    }
}
