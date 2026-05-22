package com.example.spring_boot_practice.MultiThreading;

public class CounterThread extends Thread{

    public Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for (int i=0; i < 10000; i++){
            counter.incrementCounter();
        }
        System.out.println("Counter Thread Class : ");
    }
}
