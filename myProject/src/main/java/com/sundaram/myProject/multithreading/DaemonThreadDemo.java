package com.sundaram.myProject.multithreading;

/*
* java program to demonstrate difference between a daemon thread and a user thread
* */


public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       //main thread is non-daemon thread
       String name=Thread.currentThread().getName();
       boolean isDaemon=Thread.currentThread().isDaemon();
        System.out.println("name: " + name +", is Daemon: "+isDaemon);
        Runnable task= new Task();
        Thread t1=new Thread(task,"T1");
        System.out.println("Thread spawned from a main thread");
        //calling setDaemon to make this thread as Daemon thread
        t1.setDaemon(true);
        t1.start();
        // waiting for T1 to finish
        t1.join();
    }
    private static class Task implements Runnable{
        @Override
        public void run(){
           Thread thread=Thread.currentThread();
            System.out.println("Thread made daemon by calling setDaemon() method");
            System.out.println("name: "+ thread.getName() +", isDaemon: "+thread.isDaemon());
            //Any new thread created from daemon thread is also daemon thread
            Thread thread1=new Thread("thread2");
            System.out.println("Thread spawned from a daemon thread");
            System.out.println("name: "+ thread1.getName() +", isDaemon: "+thread1.isDaemon());

        }
    }
}
