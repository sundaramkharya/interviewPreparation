package com.sundaram.myProject.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor= Executors.newSingleThreadExecutor();
        System.out.println("Single Threaded Executor: ");
        for(int i=0;i<5;i++){
            final int taskId=i;
            singleThreadExecutor.execute(()->{
                System.out.println("Single Thread Task "+ taskId+" executed by thread: "+Thread.currentThread().getName());
            });
        }
        singleThreadExecutor.shutdown();
        //Fixed Thread Pool
        ExecutorService fixedThreadPool=Executors.newFixedThreadPool(3);
        System.out.println("\n Fixed Thread Pool");
        for(int i=0;i<5;i++){
            final int taskId=i;
            fixedThreadPool.execute(()->{
                System.out.println("Fixed Pool Thread Task "+ taskId+" executed by thread: "+Thread.currentThread().getName());
            });
        }
        fixedThreadPool.shutdown();
        //cached Thread Pool
        ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
        System.out.println("\n Fixed Thread Pool");
        for(int i=0;i<5;i++){
            final int taskId=i;
            cachedThreadPool.execute(()->{
                System.out.println("Fixed Pool Thread Task "+ taskId+" executed by thread: "+Thread.currentThread().getName());
            });
        }
        cachedThreadPool.shutdown();
    }

}
