package com.webtech.task9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> balls = Arrays.asList(
                new Ball(10, Ball.Color.BLUE),
                new Ball(5, Ball.Color.BLUE),
                new Ball(10, Ball.Color.RED),
                new Ball(5, Ball.Color.YELLOW),
                new Ball(5, Ball.Color.GREEN)
        );

        Basket basket = new Basket();
        basket.setBallList(balls);

        System.out.println("Sum weight: " + basket.getBallsWeight());
        System.out.println("Blue balls count: " + basket.getBlueBallsCount());
    }
}
