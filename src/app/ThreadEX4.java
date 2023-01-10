package app;

public class ThreadEX4 {
    public static void main(String[] args) {
        Thread test = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) System.out.println("a");
            }
        };

        test.start();

        for (int j = 0; j < 10; j++) System.out.println("d");

    }
}
