package by.bsu.current_measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество измерений: ");
        int numberMeasurement = scanner.nextInt();
        Double[] I = new Double[numberMeasurement];
        Double[] U = new Double[numberMeasurement];
        for(int i = 0; i < numberMeasurement; i++){
            int j = i + 1;
            System.out.println("Введите силу тока при " + j + "-ом измерении: ");
            I[i] = scanner.nextDouble();
            System.out.println("Введите напряжение при " + j + "-ом измерении: ");
            U[i] = scanner.nextDouble();
        }
        List<Double> listI = new ArrayList<>();
        List<Double> listU = new ArrayList<>();
        for (int i = 0 ; i < numberMeasurement; i++){
            listI.add(I[i]);
            listU.add(U[i]);
        }
        System.out.println("Сила тока всех измерений : " + listI + " и напряжение при соответсвующих измерениях :" + listU);
        Double result = SquareMethod.SquareResult(I, U);
        System.out.println("По методу наименьших квадратов сопротивление на резисторе равно: " + result);
        scanner.close();
    }
}