package by.bsu.circlePoint.Data;

public class Circle extends Round {

    public Circle(){
        super();
    }

    public Circle(double x, double y,double radius) throws NotNegativeException {
        super(x, y , radius);
    }

    public void show(){
        System.out.println("Круг с центром в точке с координатами: " + '{' + this.getX() +',' + this.getY()+ "}"
                +" и радиусом: " + this.getRadius() + "создан!");
    }

    public int determining(Point point1){
        double determining = Math.sqrt(Math.pow(this.getX() - point1.getX(), 2) + Math.pow(this.getY() - point1.getY(), 2));
        if (determining == this.getRadius()){
            System.out.println("Точка лежит на границе!");
            return 0;
        }else if(determining < this.getRadius()){
            System.out.println("точка лежит внутри круга!");
            return 1;
        }else {
            System.out.println("Точка лежит вне круга!");
            return -1;
        }
    }
}
