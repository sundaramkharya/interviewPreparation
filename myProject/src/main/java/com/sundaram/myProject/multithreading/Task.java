package com.sundaram.myProject.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

/*Java code to illustrate
* Thread Pool*/
public class Task implements Runnable {
    private String name;
    public Task(String s){
        name=s;
    }
    // print task name and sleep for 1s
    // repeated 5 times
    public void run(){
        try {
            for(int i=0;i<=5;i++){
                if(i==0){
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for" + " task name - "+name+"="+sdf.format(date));
                    //prints initialization time for every task
                }
                else{
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing time for" + " task name - "+name+"="+sdf.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(name+ " Complete!!!!!!!");
        }catch (InterruptedException ie){
            System.out.println("""
                    Dukh bhare din beete re bhaiya """);
        }
    }
}
