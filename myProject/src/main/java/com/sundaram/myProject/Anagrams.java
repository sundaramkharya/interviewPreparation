package com.sundaram.myProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String s2 = "listen";
        char[] chars1=str1.toCharArray();
        char[] chars2=s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if(Arrays.equals(chars1,chars2)) System.out.println("valid");
        else System.out.println("invalid");
    }
}
