package com.example.spring_boot_practice.MultiThreading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " attempting to withdraw : " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal, remaining balance " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient amount ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not retrieve the lock");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }
}
