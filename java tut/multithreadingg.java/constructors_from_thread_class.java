class Mythr extends Thread {
    public Mythr(String name) {
        super(name); // this will give the name value to the thread class constructor
    }

    public Mythr(Runnable r, String namee) {
        super(r, namee);
    }

    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a thread");
            i++;
        }
    }
}

class mythrr implements Runnable {
    public void run() {
        System.out.println("heyyy");
    }

}

public class constructors_from_thread_class {
    public static void main(String[] args) {
        // Mythr t = new Mythr("hell");
        // t.start();
        // // t.stop();
        // System.out.println("The name of this thread is " + t.getName());

        mythrr m = new mythrr();
        Mythr mm = new Mythr(m, "hello");
        // mm.start();
        mm.run();

    }
}
