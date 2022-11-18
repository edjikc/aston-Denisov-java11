package ru.aston.test;

import java.util.Arrays;

public class DataAnalyser {
    private final int SAMPLE_NUMBER = 7;
    private final String SAMPLE_NAME = "Вячеслав";


    public String printHello(int myNumber) {
        String ansNum = "";
        if (myNumber > SAMPLE_NUMBER) {
            ansNum = "Привет";
        }
        return ansNum;
    }

    public String printNameHello(String name) {
        if (name.equals(SAMPLE_NAME)) {
            return "Привет, Вячеслав";
        }
        return "Нет такого имени";
    }

    public void printMultiple(int[] numbers) {
        for (int number : numbers) {
            if ((number % 3) == 0) {
                System.out.println(number);
            }
        }
    }
}

