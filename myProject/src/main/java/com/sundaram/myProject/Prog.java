package com.sundaram.myProject;

import java.util.Arrays;

public class Prog {
    public static void main(String[] args) {
        String str="I am a good programmer";
        String[] words=str.split(" ");

        Arrays.sort(words);
        System.out.println(words[words.length-2]);
    }
}
