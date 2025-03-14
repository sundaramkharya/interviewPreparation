package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr={5,1,7,3,9,6};
        int [] reversed = IntStream.rangeClosed(1, arr.length).map(i->arr[arr.length-i]).toArray();
        System.out.println(Arrays.toString(reversed));
    }
}
