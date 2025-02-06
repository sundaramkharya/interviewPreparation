package com.sundaram.myProject.multithreading;

public class ThreadRunnableExample implements Runnable{
    @Override
    public void run(){
        System.out.println("Doing multithreading - START "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch (Exception ex){
            System.out.println("Hello Very Bad Behaviour");
        }
    }
}
