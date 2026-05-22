package com.example.spring_boot_practice.MultiThreading;


 class CounterTest {

    private int counter = 0;

    public  void incrementCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}

public class RaceCondition {
    public static void main(String[] ar) throws InterruptedException {
        CounterTest counter = new CounterTest();
        Runnable obj1 = () -> {
            for (int i = 0; i <= 1000; i++){
                counter.incrementCounter();
            }
        };

        Runnable obj2 = () -> {
            for (int j = 0; j <= 1000; j++){
                counter.incrementCounter();
            }
        };

        Thread T1 = new Thread(obj1);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();

        T2.join();
        T1.join();

        System.out.println(counter.getCounter());

    }
}
