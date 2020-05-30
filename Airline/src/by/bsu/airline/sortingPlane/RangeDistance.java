package by.bsu.airline.sortingPlane;

import by.bsu.airline.plane.CargoPlane;
import by.bsu.airline.plane.PassengerPlane;

public class RangeDistance extends Thread {
    public void RangePlaneDistance(CargoPlane[] array1, PassengerPlane[] array2){
        int[] array12= new int[array1.length];
        int[] array22= new int[array2.length];
        for(int i=0; i < array1.length;i++){
            array12[i] = array1[i].getDistanceFlying();
        }
        for(int i=0; i < array2.length;i++){
            array22[i] = array2[i].getDistanceFlying();
        }

        for(int i=0; i < array12.length; i++){
            for(int j=0; j< array12.length; j++) {
                if (array12[i] < array12[j]){
                    int bef = array12[i];
                    array12[i] = array12[j];
                    array12[j] = bef;
                }
            }
        }

        for(int i=0; i < array22.length; i++){
            for(int j=0; j< array22.length; j++) {
                if (array22[i] < array22[j]){
                    int bef = array22[i];
                    array22[i] = array22[j];
                    array22[j] = bef;
                }
            }
        }

        System.out.println("Отсортированные грузовые самолёты по дальности: ");
        for(int i=0; i < array12.length; i++){
            System.out.println(array12[i]);
        }

        System.out.println("Отсортированные пассажирские самолёты по дальности: ");
        for(int i=0; i < array22.length; i++){
            System.out.println(array22[i]);
        }
    }
}
