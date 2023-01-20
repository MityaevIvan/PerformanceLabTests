package com.ivanmit.Task2;

import java.util.ArrayList;

public class Circle {
    private float x0;
    private float y0;
    private float radius;

    public Circle() {
    }

    public Circle(float x0, float y0, float radius) {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
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

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public static void pointsEntryCheck(ArrayList<Point> pointsCoordinatesList, Circle circle) {
        for (int i = 0; i < pointsCoordinatesList.size(); i++) {
            if ( (Math.pow(pointsCoordinatesList.get(i).getX0() - circle.getX0(), 2)) + ( (Math.pow(pointsCoordinatesList.get(i).getY0() - circle.getY0(), 2))) <  (Math.pow(circle.getRadius(), 2))) {
                System.out.println("1 - точка внутри");
            } else if ( (Math.pow(pointsCoordinatesList.get(i).getX0() - circle.getX0(), 2)) + ( (Math.pow(pointsCoordinatesList.get(i).getY0() - circle.getY0(), 2))) >  (Math.pow(circle.getRadius(), 2))) {
                System.out.println("2 - точка снаружи");
            } else if ( (Math.pow(pointsCoordinatesList.get(i).getX0() - circle.getX0(), 2)) + ( (Math.pow(pointsCoordinatesList.get(i).getY0() - circle.getY0(), 2))) ==  (Math.pow(circle.getRadius(), 2))){
                System.out.println("0 - точка лежит на окружности");
            }

        }
    }

}
