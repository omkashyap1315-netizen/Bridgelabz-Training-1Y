package com.gla.SmartDeviceControlInterface.Background_Job_Execution;

public class BackgroundJob {

    public static void main(String[] args) {

        // Background task using lambda
        Runnable task = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(3000); // Simulating long task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job finished!");
        };

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues...");
    }
}
