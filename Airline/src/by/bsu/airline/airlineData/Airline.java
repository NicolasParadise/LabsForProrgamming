package by.bsu.airline.airlineData;

import by.bsu.airline.plane.CargoPlane;
import by.bsu.airline.plane.PassengerPlane;

import java.io.Serializable;
import java.util.Arrays;

public class Airline implements Serializable {
    public static String nameAirline;
    private CargoPlane[] cargo_planes;
    private PassengerPlane[] passenger_planes;
    private int numberCargo;
    private int numberPassengers;
    private int totalCarrying;
    private int totalNumberPassenger;

    public Airline(){
        super();
    }

    public Airline(String name,int numberPassengers, int numberCargo, int totalNumberPassenger, int totalCarrying ){
        this.nameAirline = name;
        this.cargo_planes = null;
        this.passenger_planes = null;
        this.numberPassengers = numberPassengers;
        this.numberCargo = numberCargo;
        this.totalNumberPassenger = totalNumberPassenger;
        this.totalCarrying = totalCarrying;
    }

    public Airline(String name,CargoPlane[] arrayPlane1, PassengerPlane[] arrayPlane2){
        nameAirline = name;
        cargo_planes = null;
        passenger_planes = null;
        numberPassengers = 0;
        numberCargo = 0;
        totalNumberPassenger = 0;
        totalCarrying =0;
        setTotalCarrying();
        setTotalNumberPassenger();
    }



    public String getNameAirline() {
        return nameAirline;
    }

    public void setNameAirline(String nameAirline) {
        this.nameAirline = nameAirline;
    }

    public int getNumberCargo() {
        return numberCargo;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public int getTotalCarrying() {
        return totalCarrying;
    }

    public void setTotalCarrying() {
        for (int i = 0; i < numberCargo; i++) {
            this.totalCarrying += cargo_planes[i].getCarrying();
        }
    }

    public int getTotalNumberPassenger() {
        return totalNumberPassenger;
    }

    public void setTotalNumberPassenger() {
        for (int i = 0; i < numberPassengers; i++) {
            this.totalNumberPassenger += passenger_planes[i].getNumberPassenger();
        }
    }

    public void setCargo_planes(CargoPlane[] array){
        numberCargo = array.length;
        cargo_planes = new CargoPlane[numberCargo];
        for(int i=0; i < array.length;i++){
            cargo_planes[i]= new CargoPlane(array[i]);
        }
    }

    public void setPassenger_planes(PassengerPlane[] array){
        numberPassengers = array.length;
        passenger_planes = new PassengerPlane[numberPassengers];
        for(int i=0; i < numberPassengers;i++){
            passenger_planes[i]= new PassengerPlane(array[i]);
        }
    }

    public CargoPlane[] getCargo_planes() {
        return cargo_planes;
    }

    public PassengerPlane[] getPassenger_planes() {
        return passenger_planes;
    }

    public void show(){
        System.out.println("Название аэрокомпании: " + nameAirline);
        System.out.println("Количество грузовых самолётов: " + numberCargo);
        System.out.println("Количество пассажирскиз самолётов: " + numberPassengers);
        System.out.println("Общая грузоподъёмность в тоннах: " + totalCarrying);
        System.out.println("Общая вместимость пассажирами в количестве людей: " + totalNumberPassenger);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "nameAirline='" + nameAirline + '\'' +
                ", cargo_planes=" + Arrays.toString(cargo_planes) +
                ", passenger_planes=" + Arrays.toString(passenger_planes) +
                ", numberCargo=" + numberCargo +
                ", numberPassengers=" + numberPassengers +
                ", totalCarrying=" + totalCarrying +
                ", totalNumberPassenger=" + totalNumberPassenger +
                '}';
    }
}
