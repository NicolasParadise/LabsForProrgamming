package by.bsu.airline.sortingPlane;

import by.bsu.airline.plane.CargoPlane;
import by.bsu.airline.plane.PassengerPlane;

import java.util.Scanner;

public class FindFuel {
    public void FindFuelPlane(CargoPlane[] array1, PassengerPlane[] array2, Scanner scan){
        System.out.println("Введите искомых расход топлива: ");
        int fuel = scan.nextInt();
        int count1 = 0;
        int count2 = 0;
        for(int i=0, j=1; i< array1.length; i++,j++){
            if (array1[i].getFuel() == fuel){
                System.out.println("Номер нужного грузового самолёта: " + j);
                count1++;
            }
        }
        if(count1 == 0){
            System.out.println("Таких грузовых нет");
        }
        for(int i=0,j=1; i< array2.length; i++,j++){
            if (array2[i].getFuel() == fuel){
                System.out.println("Номер нужного пассажирского самолёта: " + j);
                count2++;
            }
        }
        if(count2 == 0){
            System.out.println("Таких пассажирских нет");
        }
    }
}
