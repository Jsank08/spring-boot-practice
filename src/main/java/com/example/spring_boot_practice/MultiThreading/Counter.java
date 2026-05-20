package com.example.spring_boot_practice.MultiThreading;

public class Counter {

    private int counter = 0;

    public synchronized void incrementCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
