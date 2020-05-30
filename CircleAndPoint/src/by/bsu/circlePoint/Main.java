package by.bsu.circlePoint;

import by.bsu.circlePoint.Data.Circle;
import by.bsu.circlePoint.Data.NotNegativeException;
import by.bsu.circlePoint.Data.Round;
import by.bsu.circlePoint.Data.Point;

import java.util.Scanner;

/**
 * Create an object of class Circle using the classes Point, Circle.
 * Methods: sizing, changing the radius, determining the point belongs to this circle.
 * @author Okhotnbitski Nickolas Nickolaevich
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */

public class Main {

    public static void main(String[] args) throws NotNegativeException {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Введите координаты центра круга: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println("Введите радиус круга: ");
        double radius = scan.nextDouble();
        Circle circle = new Circle(x,y,radius);
        circle.show();
        System.out.println("Введите координаты точки, на проверку её принадлежности: ");
        double x1 = scan.nextDouble();
        double y2 = scan.nextDouble();
        Point point = new Point(x1,y2);
        circle.determining(point);

        scan.close();
    }
}
