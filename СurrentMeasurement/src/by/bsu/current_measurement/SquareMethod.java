package by.bsu.current_measurement;

import java.util.Iterator;
import java.util.List;

public class SquareMethod {
    public static Double SquareResult(Double[] I, Double[] U) {
        Double sum1 = 0.;
        Double sum2 = 0.;
        Double sum3 = 0.;
        Double sum4 = 0.;
        Double sum5 = 0.;
        int size = I.length;
        if (I.length == U.length) {
            for (int i = 0; i < size; i++) {
                sum1 += I[i] * U[i];
                sum2 += I[i];
                sum3 += U[i];
                sum4 += I[i] * I[i];
            }
            sum5 = sum2 * sum2;
        }else {
            System.out.println("Проверьте данные!");
        }
        Double result = (size * sum1 - sum2 * sum3) / (size * sum4 - sum5);
        return result;
    }
}
