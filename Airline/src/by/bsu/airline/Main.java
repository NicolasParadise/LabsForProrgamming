package by.bsu.airline;

import by.bsu.airline.airlineData.Airline;
import by.bsu.airline.airlineData.InputAirline;
import by.bsu.airline.exception.NotNegativeException;
import by.bsu.airline.plane.CargoPlane;
import by.bsu.airline.plane.PassengerPlane;
import by.bsu.airline.serialization.Serializator;
import by.bsu.airline.sortingPlane.FindFuel;
import by.bsu.airline.sortingPlane.RangeDistance;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static by.bsu.airline.airlineData.InputAirline.*;

/**
 *  Airline. Define the hierarchy of aircraft. Create an airline.
 * Calculate total capacity and load capacity. Sort
 * company planes in flight range. Find an airplane in a company that matches a given range
 * of fuel consumption parameters.
 *  Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
 * Посчитать общую вместимость и грузоподъемность. Провести сортировку
 * самолетов компании по дальности полета. Найти самолет в компании, соответствующий заданному диапазону
 * параметров потребления горючего
 * @author Okhotnbitski Nickolas Nickolaevich
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */

public class Main {

    public static void main(String[] args) throws NotNegativeException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        Scanner scan = new Scanner(System.in);
        Airline airline = inputAirline2();
        //Airline airline = inputAirline(scan);
        //RangeDistance range = new RangeDistance();
       //range.RangePlaneDistance(airline.getCargo_planes(),airline.getPassenger_planes());
       // FindFuel find = new FindFuel();
        //find.FindFuelPlane(airline.getCargo_planes(),airline.getPassenger_planes(), scan);
        String file = "data\\serialization.txt";
        new Thread() {
            public void run() {
                synchronized (file) {
                    Serializator sr = new Serializator();
                    boolean result = sr.seriralization(airline, file);
                }
            }
        }.start();
            Airline.nameAirline ="БелАвиа";
            new Thread(){
                public void run() {
                    synchronized (file) {
                        try {
                            Serializator sr = new Serializator();
                            Airline air = sr.deserialization(file);
                            System.out.println(air.toString());
                        } catch (
                                Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        }.start();
            scan.close();
    }
}
