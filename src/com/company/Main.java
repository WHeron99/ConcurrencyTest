package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    // Create a new thread, and print two separate types of input concurrently
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(r1);
        t1.start();

        // Now run the main thread!
        System.out.println("Hello World! (From main thread)");
        for (int i = 0; i < 10; i++)
        {
            Thread.sleep(1500);
            System.out.println("Main thread: " + i);
        }
    }
}
