package com.example;

// Скласти алгоритм рішення задачі цілочисельної арифметики:
// викреслити із запису даного натурального числа N першу цифру.

import java.util.Scanner;

public class Main {
    private static final Scanner myInput = new Scanner( System.in );

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int given = readNumber();
        int result = deleteFirstDigit(given);
        if (result >= 0) System.out.printf("Result: %d", result);
    }

    public static int readNumber(){
        try{
            return myInput.nextInt();

        } catch (Exception e){
            System.out.println("Error occurred while reading number");
            return -1;
        }
    }

    public static int deleteFirstDigit(int number){
        if (!isNatural(number)) {
            System.out.println("Given number is not natural");
            return 0;
        }
        return number % (int) Math.pow(10, (int) Math.log10(number));
    }

    public static boolean isNatural(float number){
        return number == (int) number && number > 0;
    }
}