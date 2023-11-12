package com.naresh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindMaxLength {

    public static void main(String[] args) {
        String s = " happy diwali to all my friends andfamily";
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get());
        System.out.println(Arrays.stream(s.split(" "))
                .filter(st -> (st.trim().length() != 0))
                .min(Comparator.comparingInt(String::length)).get());
    }
}
