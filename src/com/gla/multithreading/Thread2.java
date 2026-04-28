package com.gla.multithreading;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i=9;i>=1;i--){
            System.out.println("thread:"+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    static void main(){
        Thread2 thread2 = new Thread2();
        Thread thread =  new Thread(thread2);

    }
}
