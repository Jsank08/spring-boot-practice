package com.example.spring_boot_practice.MultiThreading.Lock;

public class Main {

    public static void main(String[] args){
        BankAccount sbiAccount = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run(){
                sbiAccount.withdraw(25);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t2.start();
        t1.start();
    }

}
