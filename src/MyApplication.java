import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        // One noteworthy thing is that my Scanner could not read points, if
        // the decimals were separated by a comma rather than a dot

        File file = new File("C:\\Users\\user\\IdeaProjects\\AssignmentOne\\src\\source.txt");

        Scanner sc = new Scanner(file);
        // Create an instance of a Shape
        Shape shape = new Shape();

        // Add points until end of file
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            // Initialize point
            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        // Output results
        System.out.println("Perimeter of the shape: " + shape.calculatePerimeter());
        System.out.println("Average side of the shape: " + shape.getAverageSide());
        System.out.println("Longest side of the shape: " + shape.getLongestSide());
    }
}