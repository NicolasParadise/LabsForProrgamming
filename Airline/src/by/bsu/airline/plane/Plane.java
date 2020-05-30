package by.bsu.airline.plane;

import by.bsu.airline.exception.NotNegativeException;

import java.io.NotActiveException;
import java.io.Serializable;

public class Plane implements Serializable {
    private int distanceFlying;
    private int fuel;

    public Plane(){
        super();
    }

    public Plane(int distanceFlying, int fuel) throws NotNegativeException {
        if(distanceFlying < 0 || fuel < 0){
            throw new NotNegativeException("data is not correct!");
        }else {
            this.distanceFlying = distanceFlying;
            this.fuel = fuel;
        }
    }

    public int getDistanceFlying() {
        return distanceFlying;
    }

    public void setDistanceFlying(int distanceFlying) {
        this.distanceFlying = distanceFlying;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

}
