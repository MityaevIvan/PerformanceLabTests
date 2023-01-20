package com.ivanmit.Task4;

public class Calculator {

    public static int calculateAverage(Integer[] array){
        int average = 0;
        for (int i = 0; i < array.length; i++){
            average = average + array[i];
        }
        average = average/array.length;
        return average;
    }

    public static int calculatePaths(int average, Integer[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result = result + (Math.abs(average - array[i]));
        }
        return result;
    }
}
