package com.sundaram.myProject.codes;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    // to demonstrate frquency of each character in a string using streams
    public static void main(String[] args) {
        String string="Java is my favourite programming language";
        Map<Character,Long> charCount=string.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCount);
    }
}
