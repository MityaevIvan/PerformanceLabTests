package com.ivanmit.Task2;

import java.util.ArrayList;

public class Point {
    private float x0;
    private float y0;

    public Point() {
    }

    public Point(float x0, float y0) {
        this.x0 = x0;
        this.y0 = y0;
    }

    public float getX0() {
        return x0;
    }

    public void setX0(float x0) {
        this.x0 = x0;
    }

    public float getY0() {
        return y0;
    }

    public void setY0(float y0) {
        this.y0 = y0;
    }

    public static ArrayList<Point> initializePointsList(ArrayList<Float> pointsCoordinatesList){
        ArrayList<Point> resultList = new ArrayList<>();
        for (int i = 0; i <= pointsCoordinatesList.size()- 1; i=i+2) {
            Point point = new Point();
            point.setX0(pointsCoordinatesList.get(i));
            point.setY0(pointsCoordinatesList.get(i+1));
            resultList.add(point);

        }
        return resultList;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x0=" + x0 +
                ", y0=" + y0 +
                '}';
    }
}
