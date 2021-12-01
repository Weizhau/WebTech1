package com.webtech.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 4};
        int[] result = asIncreasingSequence(array);

        int sizeDifference = array.length - result.length;

        printArray(result);
        System.out.println("Can be thrown:" + sizeDifference);
    }

    private static int[] asIncreasingSequence(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result.add(array[i]);
                continue;
            }
            if (array[i] <= array[i + 1]) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
