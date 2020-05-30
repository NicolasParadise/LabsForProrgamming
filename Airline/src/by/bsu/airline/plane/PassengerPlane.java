package by.bsu.airline.plane;

import by.bsu.airline.exception.NotNegativeException;

import java.io.Serializable;

public class PassengerPlane extends Plane implements Serializable {
    private int numberPassenger;

    public PassengerPlane() {
        super();
    }

    public PassengerPlane(PassengerPlane ob1){
        this.setDistanceFlying(ob1.getDistanceFlying());
        this.setNumberPassenger(ob1.getNumberPassenger());
        this.setFuel(ob1.getFuel());
    }

    public PassengerPlane(int distanceFlying, int fuel, int numberPassenger) throws NotNegativeException {
        super(distanceFlying, fuel);
        if(numberPassenger < 0){
            throw new NotNegativeException("data is not correct!");
        }
        this.numberPassenger = numberPassenger;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

}
