package models;

import java.util.ArrayList;

public class Shape {
    // ArrayList to store points
    private ArrayList<Point> points;

    // Shape constructor that allocates memory for points ArrayList
    public Shape() {
        points = new ArrayList<>();
    }

    // Append a point to the points ArrayList
    public void addPoint(Point point) {
        this.points.add(point);
    }

    // This method calculates perimeter by looping through every vertex and summing
    // the distance between each consecutive pair.
    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < this.points.size() - 1; i++) {
            perimeter += this.points.get(i).distanceTo(this.points.get(i + 1));
        }
        perimeter += this.points.getLast().distanceTo(this.points.getFirst());

        return perimeter;
    }

    // This method calculates average side of the shape
    public double getAverageSide() {
        return calculatePerimeter() / this.points.size();
    }

    // This method calculates the longest side by looping through each vertex and
    // comparing distance between one pair and the next pair of points
    public double getLongestSide() {
        double longestSide = this.points.getFirst().distanceTo(this.points.get(1));

        for (int i = 1, size = this.points.size() - 1; i < size; i++) {
            double currentSide = this.points.get(i).distanceTo(this.points.get(i + 1));
            if (currentSide > longestSide)
                longestSide = currentSide;
        }

        double currentSide = this.points.getLast().distanceTo(this.points.getFirst());
        if (currentSide > longestSide)
            longestSide = currentSide;

        return longestSide;
    }
}