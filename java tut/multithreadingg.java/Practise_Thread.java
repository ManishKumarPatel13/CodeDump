class Thread1 extends Thread {
    public void run() {
        // while (true) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Welcome");
        // }
    }
}

class Thread2 extends Thread {
    public void run() {
        // while (true) {
        System.out.println("Good Morning");
        System.out.println(Thread.currentThread().getState()); // This gives if the thread is runnable or not

        // }
    }
}

public class Practise_Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
