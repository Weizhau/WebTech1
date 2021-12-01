package com.webtech.task4;

import java.util.LinkedList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        int[] numberArray = {1, 5, 6, 10, 13, 5, 9, 22, 1003, 99};

        List<Integer> primeIndexList = new LinkedList<>();
        for (int i = 0; i < numberArray.length; i++) {
            if (isPrime(numberArray[i])) {
                primeIndexList.add(i);
            }
        }

        printResult(primeIndexList);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if ((number % i) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static void printResult(List<Integer> indexList) {
        if (indexList.size() == 0) {
            System.out.println("No prime numbers in array");
        } else {
            System.out.println("Prime number indexes: " + indexList);
        }
    }
}
