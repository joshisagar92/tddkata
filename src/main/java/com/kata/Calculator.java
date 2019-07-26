package com.kata;

public class Calculator {
    public int Add(String numbers) {
        if("".equals(numbers)){
            return 0;
        }

        String [] number = numbers.split(",");
        int sum = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
        return sum;
    }
}
