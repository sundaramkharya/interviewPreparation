package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.List;

public class LastElement {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("one", "two", "three", "four", "five", "six");
        //String lastEle = words.getLast();
        String lastEle=words.stream().skip(words.size()-1).findFirst().get();
        System.out.println(lastEle);
    }

}
