package com.example.spring_boot_practice.MultiThreading;

public class DeadLock {
    
    public static void main(String[] str){

         Object obj1 = new Object();
         Object obj2 = new Object();

         Thread worker1 = new Thread(() -> {
             synchronized (obj1){
                 System.out.println("obj1 locked");
                 try {
                     Thread.sleep(2000);
                     System.out.println("obj1 woke up");
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 synchronized (obj2){
                     System.out.println("obj2 locked");
                 }
             }

             System.out.println("both object unlocked");
         });

        Thread worker2 = new Thread(() -> {
            synchronized (obj1){
                System.out.println("obj2 locked");
                try {
                    Thread.sleep(2000);
                    System.out.println("obj2 woke up");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (obj2){
                    System.out.println("obj1 locked");
                }
            }

            System.out.println("both object unlocked");
        });


        worker1.start();
        worker2.start();
    }
}
