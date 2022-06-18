package org.devopsexample;

import java.util.Random;

public class SimpleAddition {

    public int sumOfTwoIntegers(){
        Random r = new Random();
        int number_1 = r.nextInt(10 - (-10)) + (-10);
        int number_2 = r.nextInt(10 - (-10)) + (-10);
        int result = number_1 + number_2;
        System.out.println("Number_1 = " + number_1 + "\n" + "Number_2 = " + number_2 + "\n**************\n" + "The sum of two number is: " + result);
        return result;
    }

}
