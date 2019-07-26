package com.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private String numbers;
    private String regex = "[\\n|,]";
    private static Pattern pattern = Pattern.compile("\\/\\/(;)\\\\n(.*)");

    public Calculator(String numbers) {
        this.numbers = numbers;
        if(this.numbers.startsWith("//")) {
            setDelimiterAndNumbers();
        }
    }

    public int Add() {
        if("".equals(numbers)){
            return 0;
        }
        String [] number = this.numbers.split(this.regex);
        int sum = 0;
        for(int i=0; i<number.length; i++){
            sum += Integer.parseInt(number[i]);
        }
        return sum;
    }

    private void setDelimiterAndNumbers() {
            Matcher matcher = pattern.matcher(this.numbers);
            if(matcher.matches())
            {
                this.regex = matcher.group(1);
                this.numbers = matcher.group(2);
            }
        }
}
