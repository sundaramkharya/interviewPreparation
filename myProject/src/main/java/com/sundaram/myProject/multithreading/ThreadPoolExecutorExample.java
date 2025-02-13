package com.sundaram.myProject.multithreading;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool= Executors.newFixedThreadPool(3);
        //thread pool executor
        ExecutorService threadPoolExecutorObject=new ThreadPoolExecutor(1,5,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
        for(int i=1;i<5;i++){
            final int taskId=i;
            threadPoolExecutorObject.execute(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("dekho bhai kya ho rha hai");
        }
    }
}
