package app;

public class ThreadEX {
    public static void main(String[] args) {

        Runnable tast1 = new ThreadTast();

        Thread thread1 = new Thread(tast1);

        thread1.start();

        for (int i = 0; i < 100; i++) System.out.println("기차");
    }
}

class ThreadTast implements Runnable {
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("🚃");
        }
    }
}
