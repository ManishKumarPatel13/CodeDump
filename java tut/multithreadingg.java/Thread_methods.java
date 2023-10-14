class Mythrs1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread");
            try {
                Thread.sleep(455); // This will stop the thread for the given time

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
                System.out.println("Thread sleep interuptted");
            }
            i++;
        }
    }
}

class Mythrs2 extends Thread {

    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I am a thread2");
            i++;
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
        Mythrs1 m1 = new Mythrs1();
        Mythrs2 m2 = new Mythrs2();
        m1.start();
        m1.interrupt(); // this will interupt the the thread put on sleep and run the exception block
        // try {
        // m1.join(); // This will run m1 and do not start next thread till m1 is
        // terminated
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        m2.start(); // This will start immediately after starting m1 to resolve this we use join
                    // method

    }
}

/* daemon thread - it is a background thread with least priority */
