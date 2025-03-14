package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//this code is filtering duplicates using streams
public class Duplicates {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Java","Python","C#","Java","Javascript",".Net","Python");
        List<String> unique=words.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
