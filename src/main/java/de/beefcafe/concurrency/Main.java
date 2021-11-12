package de.beefcafe.concurrency;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 4; i++) {

            // manual Thread creation
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Starting thread: " + Thread.currentThread());
                    UnsafeSingleton.getInstance();
                }
            }).start();

            // Threadpools
        }
    }
}
