package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
    // first non repeating character in a string
    public static void main(String[] args) {
        String string ="Java is my favourite programming language".replaceAll("\\s+","").toLowerCase();
        Map<String,Long> charsCount= Arrays.stream(string.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        String nonRepeating=charsCount.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(nonRepeating);
    }
}
