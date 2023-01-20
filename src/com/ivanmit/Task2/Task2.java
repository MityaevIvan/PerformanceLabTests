package com.ivanmit.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {


        float[] array = new float[3];                            //getting circle values from file
        int i = 0;
        try (Scanner scan = new Scanner(new File(args[0]))) {
            while (scan.hasNextInt()) {
                float n = scan.nextInt();
                array[i++] = n;
            }
        }

        Circle circle = new Circle();                       //initializing circle
        circle.setX0(array[0]);
        circle.setY0(array[1]);
        circle.setRadius(array[2]);

        ArrayList<Float> pointCoordinatesList = new ArrayList<>();            //getting points coordinates from file
        try (Scanner scan = new Scanner(new File(args[1]))) { while (scan.hasNextInt()) {
                float n = scan.nextInt();
                pointCoordinatesList.add(n);
            }
            ArrayList<Point> pointsList= Point.initializePointsList(pointCoordinatesList);   //initialiazing points ArrayList
            Circle.pointsEntryCheck(pointsList, circle);    //checking entries

        }
    }
}


