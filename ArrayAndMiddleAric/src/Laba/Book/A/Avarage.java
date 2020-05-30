package Laba.Book.A;
import Laba.Book.A.Array;

public class Avarage{
public void AvarageMiddle(Array Array1){
    for (int i=0;i<Array1.getNumber();i++){
        double avarageLine=0;
        for(int j=0;j<Array1.getNumber();j++){
            avarageLine+=Array1.getArray(i,j);
        }
        avarageLine=avarageLine/Array1.getNumber();
        for(int j=0;j<Array1.getNumber();j++){
            double temp=Array1.getArray(i,j);
            double temp1= temp-avarageLine;
            Array1.setArray(i,j,temp1);
        }
    }
    Array1.showArray();
}}
