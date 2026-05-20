package com.example.spring_boot_practice.MultiThreading;

public class World extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println(" World thread : ");

        }
    }

    public static void main(String[] args){

        World w1 = new World();
        w1.setDaemon(true);
        w1.start();

        System.out.println(" Hello World : ");
    }
}
