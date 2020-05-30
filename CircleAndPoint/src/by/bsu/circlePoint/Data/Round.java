package by.bsu.circlePoint.Data;

import by.bsu.circlePoint.Data.Point;

public class Round extends Point {
    private double radius;

    public Round(){
        super();
        this.radius = 0;
    }

    public Round(double x, double y, double radius) throws NotNegativeException {
        super(x,y);
        if(radius <= 0) {
            throw new NotNegativeException("radius is incorrect!");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NotNegativeException {
        if(radius <= 0) {
            throw new NotNegativeException("radius is incorrect!");
        }
            this.radius = radius;
    }

    public void changeRadius(double change){
        this.radius += change;
    }

}
