package com.sundaram.myProject.multithreading;

public class SecondThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("First Thread !!!!!!!!!!");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println("Some Exception occured :{");
            }
        }
    }
    class Second{
        public static void main(String[] args) {
            com.sundaram.myProject.multithreading.SecondThread tsd=new com.sundaram.myProject.multithreading.SecondThread();
            tsd.start();
            for(int j=0;j<10;j++){
                System.out.println("Second Thread !!!!!!!!!!!!");
            }
        }
    }
}
