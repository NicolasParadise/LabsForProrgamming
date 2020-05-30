package by.bsu.task.triangle;

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
        x=0;
        y=0;
    }

    public Point(Point ob1){
        x = ob1.getX();
        y = ob1.getY();
    }

    public void show(){
        System.out.println("Первая координата точки: " + x);
        System.out.println("Вторая координата точки: " + y);
        System.out.println("-------------------------------");
    }
}
