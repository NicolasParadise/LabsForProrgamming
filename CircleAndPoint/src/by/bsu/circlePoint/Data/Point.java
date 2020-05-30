package by.bsu.circlePoint.Data;

import java.util.Objects;

public class Point {
        private double x;
        private double y;

        public void setX(double x1){
            x=x1;
        }

        public void setY(double y1){
            y=y1;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Point(double x1,double y1){
            x=x1;
            y=y1;
        }

        public Point(){
           super();
        }

        public Point(Point ob1){
            x = ob1.getX();
            y = ob1.getY();
        }

        public void show(){
            System.out.println(toString());
            System.out.println("-------------------------------");
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
