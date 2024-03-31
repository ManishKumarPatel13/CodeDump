// package multithreadingg.java;

class MyThreadRunnable1 implements Runnable {
    public void run() { // you have to make a run method in class implementing runnable interface
        int i = 0;
        while (i < 30) {
            System.out.println("I am a thread 1 not a threat");
            System.out.println("I am tired");
            i++;
        }
    }

}

class MyThreadRunnable2 implements Runnable {
    public void run() { // you have to make a run method in class implementing runnable interface
        int i = 0;
        while (i < 30) {
            System.out.println("I am a thread 2 not a threat");
            System.out.println("I am energized");
            i++;
        }
    }
}

public class creating_a_thread_using_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2); // this is how you make thread obj when using runnable interface
        gun1.start();
        gun2.start();
    }

}
