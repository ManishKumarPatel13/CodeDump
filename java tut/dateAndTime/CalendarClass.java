// package dateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        // System.out.println(c.getTimeZone());
        Calendar sc = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // This instance will have the
                                                                                    // timezone of singapore
        System.out.println(sc.getTimeZone());
        System.out.println(sc.toString());
    }
}
        
/*
 * it is an abstract class
 * 
 */