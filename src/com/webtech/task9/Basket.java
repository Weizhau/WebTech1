package com.webtech.task9;

import java.util.Collections;
import java.util.List;

public class Basket {

    private List<Ball> ballList = Collections.emptyList();

    public List<Ball> getBallList() {
        return ballList;
    }

    public void setBallList(List<Ball> balls) {
        ballList = balls;
    }

    public int getBallsWeight() {
        int weight = 0;
        for (Ball b : ballList) {
            weight += b.getWeight();
        }
        return weight;
    }

    public int getBlueBallsCount() {
        int count = 0;
        for (Ball b : ballList) {
            if (b.getColor() == Ball.Color.BLUE) {
                count++;
            }
        }
        return count;
    }

}
