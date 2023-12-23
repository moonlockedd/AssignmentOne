package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    private double Perimeter;

    Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }
}