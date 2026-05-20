package com.example.spring_boot_practice.MultiThreading;

public class MyThread extends Thread {

    @Override
    public void run(){
        try {
            System.out.println(" RUNNING : ");

            Thread.sleep(2000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(" Threat state : " + t1.getState());
        t1.start();
        System.out.println(" Thread State : " + t1.getState());
        Thread.sleep(200);
        System.out.println(" Thread State : " + t1.getState());
        t1.join();
        System.out.println(" Thread State : " + t1.getState());

    }
}
