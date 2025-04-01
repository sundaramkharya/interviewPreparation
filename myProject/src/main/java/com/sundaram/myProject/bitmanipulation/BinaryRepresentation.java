package com.sundaram.myProject.bitmanipulation;

public class BinaryRepresentation{
    public static void main(String[] args) {
        int nu=100;
        for(int i=10;i>=0;i--){
            System.out.println((nu>>i)&1);
        }


    }
}
