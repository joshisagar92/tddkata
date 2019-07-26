package com.kata;

public class Calculator {
    public int Add(String numbers) {
        if("".equals(numbers)){
            return 0;
        }
        String [] number = numbers.split(",");
        int sum = 0;
        for(int i=0; i<number.length; i++){
            sum += Integer.parseInt(number[i]);
        }
        return sum;
    }
}
