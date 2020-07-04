
package Date_and_Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Abir Hasan
 */
public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); //Decler Local Time format/Object
        System.out.println("Time : "+time);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");//Create Format for Time;
     
        String formatTime = time.format(format);  //Created Format of time contain in a string varibale for pringt
        System.out.println("Time is: "+formatTime);
    }
}
