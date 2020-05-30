package by.bsu.furniture.data;

public abstract class Wardrobe{

    private double square;

    public Wardrobe(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void accommodation(){};

    public void openDoorOfWardrobe(){}
}
