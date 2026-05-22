package com.example.spring_boot_practice.MultiThreading.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println(" Outer method called ");
            Thread.sleep(1000);
            innerMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println(" Inner method called ");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){

        ReentrantLockExample example = new ReentrantLockExample();
        example.outerMethod();

    }
}
