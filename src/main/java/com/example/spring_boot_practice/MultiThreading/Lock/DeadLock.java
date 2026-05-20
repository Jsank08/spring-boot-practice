package com.example.spring_boot_practice.MultiThreading.Lock;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using Pen " + this);
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using Pen " + this);
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using Paper " + this);
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using Paper " + this);
    }

}


public class DeadLock {
}
