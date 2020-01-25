package com.company;

public class MyThread implements Runnable {
    public void run() {
        System.out.println("Now running the second thread!");
        for (int i = 0; i < 5; i++)
        {
            try {
                Thread.sleep(2000);
                System.out.println("In Thread: " + i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted! Exiting!");
                return;
            }
        }
        System.out.println("Finished in Thread!");
    }
}
