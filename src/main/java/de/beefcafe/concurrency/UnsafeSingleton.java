package de.beefcafe.concurrency;

public class UnsafeSingleton {

    private static volatile UnsafeSingleton instance;

    private UnsafeSingleton() {
        System.out.println("New Singleton instance created: " + this);
    }

    public static synchronized UnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeSingleton();
        } else {
            System.out.println("Using existing Singleton instance");
        }
        return instance;
    }
}
