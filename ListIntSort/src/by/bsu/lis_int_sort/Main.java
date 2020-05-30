package by.bsu.lis_int_sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line = bufferedReader.readLine();
            String regex = "(\\s+)";
            String[] arrayString = line.split(regex);
            int size = arrayString.length;
            int[] arrayInt = new int[size];
            for(int i=0; i < size; i++){
                arrayInt[i] = Integer.parseInt(arrayString[i]);
            }
            int negative = 0;
            List<Integer> listFirst = new ArrayList<>();
            List<Integer> listSecond = new ArrayList<>();
            while(arrayInt[negative] >= 0){
               listFirst.add(arrayInt[negative]);
               negative++;
            }
            System.out.println("Первый список :" + listFirst);
            for(int i = negative+1; i < size; i++){
                listSecond.add(arrayInt[i]);
            }
            System.out.println("Второй список :" + listSecond);
            listFirst.sort(Integer::compareTo);
            listSecond.sort(Integer::compareTo);
            System.out.println("Отсортированный первый список: " + listFirst);
            System.out.println("Отсортированный второй список: " + listSecond);
            Iterator<Integer> integerIterator = listSecond.iterator();
            while(integerIterator.hasNext()){
                listFirst.add(integerIterator.next());
            }
            listFirst.sort(Integer::compareTo);
            System.out.println("Отсортированный общий список: " + listFirst);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
