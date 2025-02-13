package com.sundaram.myProject.multithreading;

import java.util.Random;

public class RunnableTest {
    public static void main(String[] args) throws Exception {
        RunnableExample[] randmNmbrTsk=new RunnableExample[5];
        for(int i=0;i<5;i++){
            randmNmbrTsk[i]=new RunnableExample();
            Thread t=new Thread(randmNmbrTsk[i]);
            t.start();
        }
        for(RunnableExample rex:randmNmbrTsk){
            System.out.println(rex.get());
        }
    }
}
class RunnableExample implements Runnable{
    private Object result=null;
    public void run(){
        Random generator=new Random();
        Integer randmNumbr= generator.nextInt(5);
        // As Runnable can not throw any exception
        try{
            Thread.sleep(randmNumbr*100);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        // store the result
        result=randmNumbr;
        //wake up threads blocked on the get() method
        synchronized (this){
            notifyAll();
        }
    }
    public synchronized Object get() throws InterruptedException{
        while (result==null)wait();
        return result;
    }
}