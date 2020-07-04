
package Array;

/**
 *
 * @author Abir Hasan
 */
public class For_Each__Loop {
    public static void main(String[] args) {
        String [] name = {"Abir","Nahid","Mim","Rasel","Sahed"};
        int [] num = {10,10,30,40,50,60,70,80,90,100};
        int sum = 0;
        
        for(String x : name){
            System.out.println(x);
        }
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("Sum is: "+sum);
        double avarage = sum / num.length;
        System.out.println("Avarage is: "+avarage);
    }
}
