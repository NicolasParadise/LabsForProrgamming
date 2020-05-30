package by.bsu.task.triangle;
import by.bsu.task.triangle.Point;
import by.bsu.task.triangle.Triangle;
import by.bsu.task.triangle.Search;
import java.util.Scanner;

/**
 * Define the Triangle class on the plane whose vertices have
   * type Point. Determine the area and perimeter of the triangle. Create an array (
   * list) many objects and count the number of different triangles
   * type (equilateral, isosceles, rectangular, arbitrary).
   * Determine for each group the largest and smallest in area (perimeter) object
 * @author Okhotnbitski Nickolas Nickolaevich
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество треугольников: ");
        int number = scan.nextInt();
        Triangle[] ListTr = new Triangle[number];
        for (int i = 0,j = 0;i < number ; i++,j++) {
            System.out.println("Введите координаты первой точки " + (j+1) + " треугольника : ");
            double x1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            System.out.println("Введите координаты второй точки " + (j+1) + " треугольника : ");
            double y1 = scan.nextDouble();
            double y2 = scan.nextDouble();
            System.out.println("Введите координаты третьей точки " + (j+1) + " треугольника : ");
            double z1 = scan.nextDouble();
            double z2 = scan.nextDouble();
            Point tr1 = new Point(x1, x2);
            Point tr2 = new Point(y1, y2);
            Point tr3 = new Point(z1, z2);
            ListTr[i] = new Triangle(tr1,tr2,tr3);
        }

        for (int i = 0; i < number; i++ ){
            ListTr[i].show();
        }

        Search func = new Search(ListTr);
        func.SearchFunction();

        scan.close();
    }
}
