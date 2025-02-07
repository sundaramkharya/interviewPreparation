package com.sundaram.myProject.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    static final int MAX_T=3;

    public static void main(String[] args) {
        Runnable r1=new Task("T1");
        Runnable r2=new Task("T2");
        Runnable r3=new Task("T3");
        Runnable r4=new Task("T4");
        Runnable r5=new Task("T5");
        //creates a Thread pool with MAX_T
        // no of threads as the fixed pool size
        ExecutorService pool= Executors.newFixedThreadPool(MAX_T);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        //shutdown
        pool.shutdown();
    }
}
