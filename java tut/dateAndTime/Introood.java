public class Introood {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // This gives no of milliseconds after 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365); // this will give the year
    }
}
/*
 * date is stored in the form of long number and it stores the no of
 * milliseconds passed from 1 january 1970
 * 
 * java assumes 1900 as start year so java year returns years passed after 1900
 * 
 */