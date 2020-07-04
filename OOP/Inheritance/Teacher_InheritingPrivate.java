
package OOP.Inheritance;

/**
 *
 * @author Abir Hasan
 */
public class Teacher_InheritingPrivate extends Person_InheritPrivateMember{
    /*
    getName(), setName(), setAge(),getAge()
    */
   private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void diplay(){
         System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Qualification: "+getQualification());
    }
   
}
