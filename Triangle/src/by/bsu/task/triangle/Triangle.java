package by.bsu.task.triangle;
import by.bsu.task.triangle.Point;

public class Triangle {
private Point pointsTr1;
private Point pointsTr2;
private Point pointsTr3;
private String view;
private double area;
private double perimeter;
private double side1;
private double side2;
private double side3;
private double[] vector1 ;
private double[] vector2 ;
private double[] vector3 ;

public Triangle(Point tr1, Point tr2, Point tr3){
        pointsTr1 = new Point(tr1);
        pointsTr2 = new Point(tr2);
        pointsTr3 = new Point(tr3);
        double[] vector1 = null;
        double[] vector2 = null;
        double[] vector3 = null;
        this.setVector1();
        this.setVector2();
        this.setVector3();
        this.setSide1();
        this.setSide2();
        this.setSide3();
        this.setPerimeter();
        this.setArea();
        this.setView();
}

public Triangle(Triangle object1){
        this.pointsTr1 = new Point(object1.pointsTr1);
        this.pointsTr2 = new Point(object1.pointsTr2);
        this.pointsTr3 = new Point(object1.pointsTr3);
        double[] vector1 = null;
        double[] vector2 = null;
        double[] vector3 = null;
        this.setVector1();
        this.setVector2();
        this.setVector3();
        this.setSide1();
        this.setSide2();
        this.setSide3();
        this.setPerimeter();
        this.setArea();
        this.setView();

}

public void setPointsTr(Point Tr1,Point Tr2,Point Tr3){
        pointsTr1 = Tr1;
        pointsTr2 = Tr2;
        pointsTr3 = Tr3;
}

public void setVector1() {
        vector1 = new double[2];
        vector1[0]= pointsTr1.getX() - pointsTr2.getX();
        vector1[1]= pointsTr1.getY() - pointsTr2.getY();
}

public void setVector2() {
        vector2 = new double[2];
        vector2[0]= pointsTr2.getX() - pointsTr3.getX();
        vector2[1]= pointsTr2.getY() - pointsTr3.getY();
}

public void setVector3() {
        vector3 = new double[2];
        vector3[0]= pointsTr3.getX() - pointsTr1.getX();
        vector3[1]= pointsTr3.getY() - pointsTr1.getY();
}

public double DotVector(double[] vector1 ,double[] vector2){
        double result = 0;
        result = vector1[0] * vector2[0] + vector1[1] * vector2[1];
        return result;
}

public void setSide1() {
        side1 = Math.sqrt(DotVector(vector1,vector1));
}

public void setSide2() {
        side2 = Math.sqrt(DotVector(vector2,vector2));
}

public void setSide3() {
        side3 = Math.sqrt(DotVector(vector3,vector3));
}

public void setPerimeter() {
        perimeter = side1 + side2 + side3;
}

public void setArea() {
        double mediumPerimeter = perimeter/2;
        area = Math.sqrt(mediumPerimeter * (mediumPerimeter - side1) * (mediumPerimeter - side2) * (mediumPerimeter - side3));
}

public void setView() {
        if ((side1 == side2) && (side2 == side3) && (side3 == side1)){
            view = "Равносторонний";
        }else if ((side1 == side2) || (side2 == side3) || (side3 == side1)){
                view = "Равнобедренный";
        }else if (DotVector(vector1,vector2)==0 || DotVector(vector2,vector3)==0 || DotVector(vector3,vector1)==0){
                view = "Прямоугольный";
        }else {
                view = "Произвольный";
        }
}

public Point getPointsTr1(){
    return pointsTr1;
}

public Point getPointsTr2(){
    return pointsTr2;
}

public Point getPointsTr3(){
    return pointsTr3;
}

public double getArea(){
        return area;
}

public double getPerimeter() {
        return perimeter;
}

public String getView() {
        return view;
}

public double getSide1(){
        return side1;
}

public double getSide2() {
        return side2;
}

public double getSide3() {
        return side3;
}

public void show(){
        System.out.println("Координаты первой вершины: " + '{' + pointsTr1.getX() + " ; " + pointsTr1.getY() + '}');
        System.out.println("Координаты второй вершины: " + '{' + pointsTr2.getX() + " ; " + pointsTr2.getY() + '}');
        System.out.println("Координаты третьей вершины: " + '{' + pointsTr3.getX() + " ; " + pointsTr3.getY() + '}');
        System.out.println("Вид треугольника: " + view);
        System.out.println("Площадь треугольника: "+ area);
        System.out.println("Периметр треугольника: " + perimeter);
        System.out.println("-------------------------------------");
}

}
