package com.sundaram.myProject.multithreading;
/*
* Thread has a priority that helps thread scheduler to determine
* the order in which thread scheduled
* MIN_PRIORITY=1
* NORM_PRIORITY=5
* HIGH_PRIORITY=10*/
public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Running Thread name is: "+Thread.currentThread().getName());
        System.out.println("Running Thread priority is: "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        ThreadPriority tp2=new ThreadPriority();
        tp1.setPriority(Thread.MAX_PRIORITY);
        tp2.setPriority(Thread.MIN_PRIORITY);
        tp1.start();
        tp2.start();
    }
}
