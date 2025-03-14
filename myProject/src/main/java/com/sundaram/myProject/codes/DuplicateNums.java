package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNums {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(111,222,333,111,555,333,777,222);
        Set<Integer> uniques=new HashSet<>();
        Set<Integer> duplicates=nums.stream().filter(i->!uniques.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
