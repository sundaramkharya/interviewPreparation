package com.sundaram.myProject.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws Exception {
        //FUture is a concrete class that
        //implements both runnable and Callable
        FutureTask[] randomNumberTasks=new FutureTask[5];
        for(int i=0;i<5;i++){
            Callable callable=new CallableExample();
            randomNumberTasks[i]=new FutureTask(callable);
            //As it implements Runnable , creating Task with Future Task
            Thread t=new Thread(randomNumberTasks[i]);
            t.start();
        }
        for(int i=0;i<5;i++){
            // As it implements Future, we can call get
            System.out.println(randomNumberTasks[i].get());
        }
    }
}
class CallableExample implements Callable{
    public Object call() throws Exception{
        Random generator= new Random();
        Integer randomNumber= generator.nextInt(5);
        Thread.sleep(randomNumber*100);
        return randomNumber;
    }
}