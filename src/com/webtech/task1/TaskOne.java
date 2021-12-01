package com.webtech.task1;

public class TaskOne {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println("Argument x: " + x + "\nArgument y: " + y);
        System.out.println("Result: " + solve(x, y));
    }

    private static double solve(double x, double y) {
        double output;

        output = 1 + Math.pow(Math.sin(x + y), 2);
        output /= 2 + Math.abs(x - ((2 * x)/(1 + Math.pow(x, 2) * Math.pow(y, 2))));
        output += x;

        return output;
    }

}
