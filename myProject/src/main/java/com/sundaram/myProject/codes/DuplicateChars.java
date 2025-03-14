package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        String string ="Java is my favourite programming language".replaceAll("\\s+","").toLowerCase();
        Set<String> unique=new HashSet<>();
        Set<String> duplicates= Arrays.stream(string.split("")).filter(ch->!unique.add(ch)).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
