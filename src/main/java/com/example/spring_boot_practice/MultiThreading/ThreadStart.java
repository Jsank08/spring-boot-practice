package com.example.spring_boot_practice.MultiThreading;

public class ThreadStart {

    public static void main(String[] args){

        Counter counter = new Counter();

       CounterThread c1 = new CounterThread(counter);
       c1.start();
        CounterThread c2 = new CounterThread(counter);
        c2.start();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" c1.getState() " + c1.getState() + " counter value : " + counter.getCounter());
    }
}
