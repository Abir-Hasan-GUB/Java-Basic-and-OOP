
package OOP.Final_Keyword;

/**
 *
 * @author Abir Hasan
 */
public class University {
    
    final String UNIVERSITY_NAME = "GUB"; // Final variable
    
    final int fee; // blanck final variable
    /*
    blanck final variable constructor er maddhome 
    decler/initialize korte hoi,
    */
    
    University(int fee){
      this.fee = fee;/*
        blanck final variable ke constructor
        er maddhome initialize korte hoi.
        */
    }
    
    static final int batch; //static blanck final variable
    static{
        batch = 181;/*
       " Static final blanck " varible ke static
        block er maddhome initialize korte hoi.
        */
    }
    
    
    void print(){
        System.out.println("UV name: "+UNIVERSITY_NAME);
        System.out.println("Batch: "+batch);
        System.out.println("Fee: "+fee);
    }
}
