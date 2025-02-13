package com.sundaram.myProject.multithreading;

public class RaceConditionEx {
    public static void main(String[] args) {
        Thread t1=new Thread(new Counter(),"t1");
        Thread t2=new Thread(new Counter(),"t2");
        Thread t3=new Thread(new Counter(),"t3");
        // to see a magic change start with run and you see
        // it will be returning main thread
        t1.start();
        t2.start();
        t3.start();
    }
}
class Counter implements Runnable {
    private int c=0;
    public void increment (){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        c++;
    }
    public void decrement(){
        c--;
    }
    int getValue(){
        return c;
    }
    @Override
    public void run() {
        synchronized (this) {
            //increment
            this.increment();
            System.out.println("Value after increase " + Thread.currentThread().getName() + " " + this.getValue());
            //decrement
            this.decrement();
            System.out.println("Value after decrease " + Thread.currentThread().getName() + " " + this.getValue());
        }
    }
}