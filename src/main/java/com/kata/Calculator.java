package com.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private String numbers;
    private String delimiter = "[\\n|,]";
    private static final Pattern DELIMITER_PATTERN = Pattern.compile("\\/\\/(;)\\\\n(.*)");

    public Calculator(String numbers) {
        this.numbers = numbers;
        if(this.numbers.startsWith("//")) {
            setDelimiterAndNumbers();
        }
    }

    public int add() {
        if("".equals(numbers)){
            return 0;
        }
        String [] number = this.numbers.split(this.delimiter);
        int sum = 0;
        for(int i=0; i<number.length; i++){
            sum += Integer.parseInt(number[i]);
        }
        return sum;
    }

    private void setDelimiterAndNumbers() {
            Matcher matcher = DELIMITER_PATTERN.matcher(this.numbers);
            if(matcher.matches())
            {
                this.delimiter = matcher.group(1);
                this.numbers = matcher.group(2);
            }
        }
}
