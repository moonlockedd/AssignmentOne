import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\AssignmentOne\\src\\data.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter of the shape: " + shape.calculatePerimeter());
        System.out.println("Average side of the shape: " + shape.getAverageSide());
        System.out.println("Longest side of the shape: " + shape.getLongestSide());
    }
}