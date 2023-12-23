package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0, size = this.points.size(); i < size; i++) {
            if (i + 1 != size)
                perimeter += this.points.get(i).distanceTo(this.points.get(i + 1));
            else
                perimeter += this.points.get(i).distanceTo(this.points.getFirst());
        }

        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / this.points.size();
    }

    public double getLongestSide() {
        double longestSide = this.points.get(0).distanceTo(this.points.get(1));

        for (int i = 1, size = this.points.size(); i < size; i++) {
            double currentSide;

            if (i + 1 != size)
                currentSide = this.points.get(i).distanceTo(this.points.get(i + 1));
            else
                currentSide = this.points.get(i).distanceTo(this.points.getFirst());

            if (currentSide > longestSide)
                longestSide = currentSide;

        }

        return longestSide;
    }
}