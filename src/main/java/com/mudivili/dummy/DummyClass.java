package com.mudivili.dummy;

public class DummyClass {

    public String isVacationTime(boolean vacationTime) {
        return vacationTime ? "I'm on vacation." : "I'm working.";
    }

    public void printNumbers(int[] numbers) {
        System.out.println("Printing numbers in array.");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
