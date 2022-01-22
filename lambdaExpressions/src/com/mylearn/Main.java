package com.mylearn;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, Integer> plusOne = (x) -> x + 1;
        System.out.println ("testing of assign lambda to functional interface " + plusOne.apply(5));
        BiFunction<Integer, Integer, Integer> addTwoNumbers = (x, y) -> x + y;
        Integer z = addTwoNumbers.apply(2, 3);
        System.out.println("Sum check = " + z);


    }
}
