package com.sundaram.myProject.multithreading;
/*
* inter thread communicating is a mechanism in which a thread is paused
* running in its critical section and another thread is allowed to enter (or lock)
* in the same critical section to be executed.it is implemented by
* wait(),notify(),notifyAll()*/
public class ThreadCommunication {
    public static void main(String[] args) {
        ThreadB threadB=new ThreadB();
        threadB.start();
        synchronized (threadB){
            try{
            System.out.println("waiting for threadB to complete.....");
            threadB.wait();}
            catch(InterruptedException ie){
                System.out.println("Total is: "+ threadB.total);
            }
        }
    }
    static class ThreadB extends Thread{
        int total;
        public void run(){
            synchronized (this){
                for(int i=0;i<100;i++){
                    total+=i;
                    System.out.println(total);
                }
                // notify used to avoid deadlock situation
                notify();
            }
        }
    }
}
