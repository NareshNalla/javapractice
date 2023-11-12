package com.naresh;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxLength {

    public static void main(String[] args) {
        String s = " happy diwali to all my friends andfamily";
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get());
    }
}
