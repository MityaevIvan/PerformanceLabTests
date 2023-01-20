package com.ivanmit.Task1;

public class PathCalculator {
    public static void calculatePath(String step, int[] array){
        int current = 0;
        System.out.print("Path: ");
        do {
            System.out.print(array[current]);
            current = (current + Integer.parseInt(step) - 1) % array.length;
        } while (current != 0);
    }
}
