package models;

public class Point {
    // X and Y coordinates
    private double x;
    private double y;

    // Point constructor that initializes the point instance with given
    // x and y coordinates
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    // Setters and Getters
    private void setY(double y) {
        this.y = y;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // This method calculates the distance between a current point and the next point,
    // which is given as a parameter.
    public double distanceTo(Point nextPoint) {
        double x1 = x;
        double y1 = y;
        double x2 = nextPoint.getX();
        double y2 = nextPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public String toString() {
        return "x-coordinate: " + x +
                "\ny-coordinate: " + y +
                "\n";
    }
}