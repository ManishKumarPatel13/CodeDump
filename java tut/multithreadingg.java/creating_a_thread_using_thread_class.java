// package multithreadingg.java;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 3;
        while (i < 6) {
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    int ii = 0;

    public void run() {
        while (ii < 3) {
            System.out.println("Thread 2 is good");
            System.out.println("I am sad");
            ii++;
        }
    }
}

public class creating_a_thread_using_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // You have to use start method to start a thread class
        t2.start();
    }
}
