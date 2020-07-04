
package Date_and_Time;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Abir Hasan
 */
public class Date {
    public static void main(String[] args) {
        // Create Date object use Date class;
        LocalDate myObj = LocalDate.now();
        System.out.println("Local Date: "+myObj);
        
        // Create Time object use Date class;
        LocalTime mytime = LocalTime.now();
        System.out.println("Local Date: "+mytime);
        
        
        // Fomatting date and time:
        LocalDate abir = LocalDate.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Local Date: "+myFormatObj);
    }
}
