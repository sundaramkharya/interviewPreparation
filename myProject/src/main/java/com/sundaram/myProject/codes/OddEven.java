package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// given a list of integers, separate odd/even numbers
public class OddEven {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(71,18,42,21,67,32,95,14,56,87);
        // even nums will be stored in the key TRUE
        // debug it
        Map<Boolean,List<Integer>> oddEve=integerList.stream().collect(Collectors.partitioningBy(i->i%2==0));
        for(Map.Entry<Boolean,List<Integer>> entry:oddEve.entrySet()){
            if(entry.getKey()) System.out.println("even numbers");
            else System.out.println("odd numbers");

            List<Integer> list=entry.getValue();
            for(int i:list) System.out.println(i);
        }
    }
}
