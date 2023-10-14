// package dateAndTime;

import java.sql.Date;

public class DateClass {
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());

        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);
        System.out.println(d.getYear()); // returns years passed after 1900
    }
}
