package app;

public class ThreadEX2 {
    public static void main(String[] args) {
        ThreadTest2 thread2 = new ThreadTest2();

        thread2.start();

        for (int i = 0; i < 100; i++ ) System.out.println("💎");
    }
}

class ThreadTest2 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("🚗");
        }
    }
}
