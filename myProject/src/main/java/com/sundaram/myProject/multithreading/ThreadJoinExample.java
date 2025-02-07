package com.sundaram.myProject.multithreading;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnable(),"t1");
        Thread t2=new Thread(new MyRunnable(),"t2");
        Thread t3=new Thread(new MyRunnable(),"t3");
        Thread t4=new Thread(new MyRunnable(),"t4");
        t1.start();
        //start second thread after waitinng for 2 seconds or if its dead
        try{
            t1.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        //start 3rd thread only when first thread is dead
        try{
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        t4.start();
        //let all Thread finish execution before finishing main thread
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread started: "+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error!!!!!!!!!");
        }
        System.out.println("Thread ended: "+ Thread.currentThread().getName());
    }
}
