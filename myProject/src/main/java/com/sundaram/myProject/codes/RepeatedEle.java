package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedEle {
    public static void main(String[] args) {
        List<String> objects= Arrays.asList("pen","pencil","rubber","pen","sharpner","compass","divider","pen","rubber");
        Map<String,Long> objectCount=objects.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map.Entry<String,Long> freq=objectCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(freq);
    }
}
