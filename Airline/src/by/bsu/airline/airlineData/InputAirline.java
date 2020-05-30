package by.bsu.airline.airlineData;

import by.bsu.airline.exception.NotNegativeException;
import by.bsu.airline.plane.CargoPlane;
import by.bsu.airline.plane.PassengerPlane;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InputAirline {
    public static Airline inputAirline(Scanner scan) throws NotNegativeException {
        try{
            scan = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Введите название авиакомпании: ");
        String name = scan.next();
        System.out.println("Введите количество грузовых самолётов: ");
        int number1 = scan.nextInt();
        System.out.println("Введите количество пассажирских самолётов: ");
        int number2 = scan.nextInt();
        int[] distanceFlying1 = new int[number1];
        System.out.println("Введите дальность полёта для каждого грузового самолёта в км: ");
        for (int i=0; i< number1; i++){
            distanceFlying1[i] = scan.nextInt();
        }
        int[] distanceFlying2 = new int[number2];
        System.out.println("Введите дальность полёта для каждого пассажирского самолёта в км: ");
        for (int i=0; i< number2; i++){
            distanceFlying2[i] = scan.nextInt();
        }
        int[] fuel1 = new int[number1];
        System.out.println("Введите расход топлива каждого грузового самолёта: ");
        for (int i=0; i< number1; i++){
            fuel1[i] = scan.nextInt();
        }
        int[] fuel2 = new int[number2];
        System.out.println("Введите расход топлива каждого пассажирского самолёта: ");
        for (int i=0; i< number2; i++){
            fuel2[i] = scan.nextInt();
        }
        int[] carrying = new int[number1];
        System.out.println("Введите грузоподъёмность каждого грузового самолёта в тоннах: ");
        for (int i=0; i< number1; i++){
            carrying[i] = scan.nextInt();
        }
        int[] numberPassenger = new int[number2];
        System.out.println("Введите вместимость каждого пассажирского самолёта: ");
        for (int i=0; i< number2; i++){
            numberPassenger[i] = scan.nextInt();
        }
        CargoPlane[] cargo = new CargoPlane[number1];
        for(int i=0; i< number1; i++){
            cargo[i] = new CargoPlane(distanceFlying1[i],fuel1[i],carrying[i]);
        }
        PassengerPlane[] passenger = new PassengerPlane[number2];
        for(int i=0; i< number2; i++){
            passenger[i] = new PassengerPlane(distanceFlying2[i],fuel2[i],numberPassenger[i]);
        }

        Airline airline = new Airline(name,cargo,passenger);
        airline.show();
        return airline;
    }

    public static Airline inputAirline2(){
        Airline airlines = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/watch?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false", "root", "nicolas9017");
            Statement statement = connection.createStatement();
            String sql = " select * from airline ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int numberCargo = resultSet.getInt(2);
                int numberPassengers  = resultSet.getInt(3);
                int totalCarrying = resultSet.getInt(4);
                int totalNumberPassenger = resultSet.getInt(5);
                airlines = new Airline(name, numberPassengers, numberCargo, totalNumberPassenger, totalCarrying);
            }
            airlines.show();
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return airlines;
    }
}
