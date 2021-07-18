package com.test.j4test;

import java.util.function.Function;

public class LuckyTicket {
    public boolean isLucky(int inputNumber){

        Function<Integer, Integer> summator = (input) -> {
            int firstDigit = Math.floorMod(input / 100,1);
            int secondDigit = input - firstDigit * 100;
            secondDigit = Math.floorMod(secondDigit / 10, 1);
            int thirdDigit = input - firstDigit * 100 - secondDigit * 10;
            return firstDigit + secondDigit + thirdDigit;
        };

        int leftNumber = inputNumber / 1000;
        int rigthNumber = inputNumber - leftNumber;
        return summator.apply(leftNumber).equals(summator.apply(rigthNumber));
    }
}
