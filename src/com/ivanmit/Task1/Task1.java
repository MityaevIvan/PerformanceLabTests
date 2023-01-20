package com.ivanmit.Task1;

public class Task1 {
    public static void main(String[] args) {
        int [] array = CircularArrayInitializer.initialize(args[0]);
        PathCalculator.calculatePath(args[1], array);
    }
}
