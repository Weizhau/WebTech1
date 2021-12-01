package com.webtech.task2;

public class Task2 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println("Argument x: " + x + "\nArgument y: " + y);

        boolean dotsInArea = inUpperRect(x, y) || inBottomRect(x, y);
        System.out.println("Result: " + dotsInArea);
    }

    private static boolean inUpperRect(double x, double y) {
        return (x >= -4d && x <= 4d) && (y >= 0d && y <= 5d);
    }

    private static boolean inBottomRect(double x, double y) {
        return (x >= -6d && x <= 6d) && (y <= 0d && y >= -3d);
    }

}
