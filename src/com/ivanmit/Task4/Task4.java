package com.ivanmit.Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numsList = new ArrayList<>();
        try (Scanner scan = new Scanner(new File(args[0]))) {
            while (scan.hasNextInt()) {
                int n = scan.nextInt();
                numsList.add(n);
            }

            Integer[] numsArray = numsList.toArray(new Integer[numsList.size()]);
            int average =  Calculator.calculateAverage(numsArray);
            int paths = Calculator.calculatePaths(average, numsArray);
            System.out.println(paths);






        }

    }}