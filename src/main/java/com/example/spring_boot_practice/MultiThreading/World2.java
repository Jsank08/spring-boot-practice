package com.example.spring_boot_practice.MultiThreading;

public class World2 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(" World Runnable : ");
        }
    }

}
