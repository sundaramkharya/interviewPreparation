package com.sundaram.myProject.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

// this is an example of race condition
public class Atomic_Ex {
    public static void main(String[] args) {
        SharedCounter counter=new SharedCounter();
        //thread 1
        new Thread(()->{
            System.out.println("Thread 1 started");
            for(int i=0;i<50000;i++){
                counter.increment();
            }
            System.out.println("Thread 1 execution completed");
        }).start();
        //Thread 2
        new Thread(()->{
            System.out.println("Thread 2 started");
            for(int i=0;i<50000;i++){
                counter.increment();
            }
            System.out.println("Thread 2 execution completed");
        }).start();
        System.out.println(counter.getCount());
    }
}
class SharedCounter{
    private AtomicInteger count= new AtomicInteger(0) ;
    public void increment(){
        //what it will do is before second thread access this same resource the real value has
        // to be available in the main memory
        count.incrementAndGet();
    }
    public int getCount(){
        return count.get();
    }
}
