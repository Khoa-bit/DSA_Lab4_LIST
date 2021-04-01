import geom.Point2D;
import list.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================================================java.util.ArrayList====================================================");

        Point2D[] point2DS = Point2D.generatePoint2D(30);
        List<Point2D> point2DList = new ArrayList<>(Arrays.asList(point2DS));

        System.out.println("Before modification: ");
        System.out.println(point2DList);

        Point2D.removeHittedPoints(point2DList, new Point2D(5, 5), 5);

        System.out.println("After modification: ");
        System.out.println(point2DList);

        System.out.println("\n================================================MyArrayList Implementation================================================");

        point2DS = Point2D.generatePoint2D(30);
        List<Point2D> point2DMyArrayList = new MyArrayList<>(Arrays.asList(point2DS));

        System.out.println("Before modification: ");
        System.out.println(point2DMyArrayList);

        Point2D.removeHittedPoints(point2DMyArrayList, new Point2D(5, 5), 5);

        System.out.println("After modification: ");
        System.out.println(point2DMyArrayList);
    }
}
