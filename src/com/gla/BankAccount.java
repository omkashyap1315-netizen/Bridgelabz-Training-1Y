package com.gla;

class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " (" + type + ") is checking balance. Priority: "
                + Thread.currentThread().getPriority());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
