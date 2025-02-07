package com.sundaram.myProject.multithreading;

public class DeadlockExample extends Thread{
    HiClass hi=new HiClass();
    HelloClass hello=new HelloClass();
    public void demo(){
        this.start();
        hello.first(hi);
    }
    public void run(){
        hi.first(hello);
    }
    public static void main(String[] args) {
        DeadlockExample de=new DeadlockExample();
        de.demo();
    }
}
class HelloClass{
    public synchronized void first(HiClass hi){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("HelloClass is calling -->>> HiClass second() method");
            hi.second();
        }
    }
    public synchronized void second(){
        System.out.println("I am the Second method from HelloClass");
    }
}
class HiClass{
    public synchronized void first(HelloClass hello){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("HiClass  is calling------>>>>>> HelloClass second() method  ");
            hello.second();
        }
    }
    public synchronized void second(){
        System.out.println("I am from HiClass");
    }
}

