package Laba.Book.A;
import java.util.Arrays;

public class Array {
    private int number;
    private double[][] Array;
    public void setNumber(int number1){
        number = number1;
    }

    public int getNumber() {
        return number;
    }

    public void setArray(int number) {
        Array= new double[number][number];
        for (int i=0;i<number;i++){
            for (int j=0;j<number;j++){
                Array[i][j] = (double)(Math.random()*2*number) - number;
            }}
    }

    public void setArray(int i,int j,double num) {
        Array[i][j]=num;
    }

    public double[][] getArray() {
        return Array;
    }
    public double getArray(int i,int j) {
        return Array[i][j];
    }

    public void showArray(){
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Arrays.toString(Array[i]));
        }
    }
}
