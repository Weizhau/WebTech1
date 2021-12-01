package com.webtech.task3;

public class Task3 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);

        System.out.println("Argument a: " + a +
                "\nArgument b: " + b +
                "\nArgument h: " + h);

        printSolvingTable(a, b, h);
    }

    private static void printSolvingTable(double a, double b, double h) {
        System.out.println("\nx                    F(x)");
        for (double x = a; x < b; x += h) {
            System.out.println(x + "|" + Math.tan(x));
        }
    }
}
