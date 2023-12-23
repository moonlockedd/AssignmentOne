package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    private double Perimeter;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < this.points.size(); i++) {
            if (i + 1 != this.points.size())
                perimeter += this.points.get(i).distanceTo(this.points.get(i + 1));
            else
                perimeter += this.points.get(i).distanceTo(this.points.getFirst());
        }

        return perimeter;
    }
}