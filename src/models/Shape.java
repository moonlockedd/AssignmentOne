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

        for (int i = 0; i < this.points.size() - 1; i++) {
            perimeter += this.points.get(i).distanceTo(this.points.get(i + 1));
        }
        perimeter += this.points.getLast().distanceTo(this.points.getFirst());

        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / this.points.size();
    }

    public double getLongestSide() {
        double longestSide = this.points.get(0).distanceTo(this.points.get(1));

        for (int i = 1, size = this.points.size() - 1; i < size; i++) {
            double currentSide = this.points.get(i).distanceTo(this.points.get(i + 1));

            if (currentSide > longestSide)
                longestSide = currentSide;

        }
        double currentSide = this.points.getLast().distanceTo(this.points.getLast());
        if (currentSide > longestSide)
            longestSide = currentSide;

        return longestSide;
    }
}