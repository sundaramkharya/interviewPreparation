package com.sundaram.myProject.codes;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String palin="rotator";
        boolean isPalidrome= IntStream.range(0,palin.length()/2).noneMatch(i -> palin.charAt(i) != palin.charAt(palin.length()-i-1));
        System.out.println(isPalidrome);
    }
}
