package by.bsu.watches;

import by.bsu.watches.JDBC.Find;
import by.bsu.watches.entity.Watches;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Введите искомый тип часов: ");
        String type = scanner.next();
        System.out.println("Марки заданного типа часов: ");
        Find.findMakerOfType(type);
        System.out.println("Введите нужную цену: ");
        int price = scanner.nextInt();
        System.out.println("Информация о механических часах, цена на которые не превышает заданную: ");
        Find.findPrice(price);
        System.out.println("Введите искомую страну: ");
        String country = scanner.next();
        System.out.println("Марки часов, изготовленных и заданной стране: ");
        Find.findCountry(country);
        System.out.println("Введите нужное количество часов: ");
        int number = scanner.nextInt();
        System.out.println("Производители, общая сумма часов которых в магазине не превышает заданную: ");
        Find.findMakerNumber(number);
        scanner.close();
    }
}
