package com.gla.multithreading;

public class Thread1 extends Thread{
    public void run(){
        for (int i =1;i<10;i++){
            System.out.println("thread1:"+i);
           try {
               Thread.sleep(1000);
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
        }
    }
    static void main(){
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        Thread thread =  new Thread(thread2);
        thread.start();
    }
}
