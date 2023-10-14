class MyThread3 extends Thread {

    MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 3;
        while (i < 6) {
            System.out.println("My thread is running");
            System.out.println("I am happy");
            i++;
        }
        System.out.println("I'm thread: " + Thread.currentThread().getName());
        System.out.println("I'm thread: " + Thread.currentThread().getPriority());
    }
}

class MyThread4 extends Thread {
    int ii = 0;

    MyThread4(String name) {
        super(name);
    }

    public void run() {
        while (ii < 3) {
            System.out.println("Thread 2 is good");
            System.out.println("I am sad");
            ii++;
        }
        System.out.println("I'm thread: " + Thread.currentThread().getName());
        System.out.println("I'm thread: " + Thread.currentThread().getPriority());
    }
}

public class Thread_priority {
    public static void main(String[] args) {
        MyThread3 m1 = new MyThread3("heyy");
        MyThread4 m2 = new MyThread4("hello");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY); // this will run first
        m1.start();
        m2.start();

    }
}

/*
 * priority ranges from 1 - 10 if two threads have same priority then the thread
 * scheduler picks randomly
 */