package app;

public class ThreadEX3 {
    public static void main(String[] args) {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 100; j++) System.out.println("🎇");
            }
        });

        thread1.start();

        for (int i = 0; i < 100; i++) System.out.println("🎄");
    }
}
