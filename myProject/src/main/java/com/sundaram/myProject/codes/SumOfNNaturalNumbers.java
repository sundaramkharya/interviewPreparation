package com.sundaram.myProject.codes;

import java.util.stream.IntStream;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum);
    }
}
