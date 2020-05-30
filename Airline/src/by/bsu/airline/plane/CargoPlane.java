package by.bsu.airline.plane;

import by.bsu.airline.exception.NotNegativeException;

import java.io.Serializable;

public class CargoPlane extends Plane implements Serializable {

    private int carrying;

    public CargoPlane(){
        super();
    }

    public CargoPlane(CargoPlane ob1){
        this.setDistanceFlying(ob1.getDistanceFlying());
        this.setCarrying(ob1.getCarrying());
        this.setFuel(ob1.getFuel());
    }

    public CargoPlane(int distance, int fuel, int carrying1) throws NotNegativeException {
        super(distance,fuel);
        if(carrying1 < 0){
            throw new NotNegativeException("data is not correct!");
        }
        carrying = carrying1;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

}
