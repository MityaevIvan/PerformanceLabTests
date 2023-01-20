package com.ivanmit.Task1;

import java.util.Arrays;

public class CircularArrayInitializer {
    public static int[] initialize(String n){
        int[] array = new int[Integer.parseInt(n)];
        Arrays.setAll(array, i -> ++i);
        return array;
    }
}
