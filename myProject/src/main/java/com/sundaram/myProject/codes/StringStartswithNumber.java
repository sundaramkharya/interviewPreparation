package com.sundaram.myProject.codes;

import java.util.Arrays;
import java.util.List;

public class StringStartswithNumber {
    public static void main(String[] args) {
      List<String> number= Arrays.asList("one","2wo","3hree","four","5ive");
      number.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
