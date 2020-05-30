package by.bsu.file_string;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = null;
        System.out.println("Введите слово или подстроку, которую надо удалить: ");
        String stringFind = scan.next();
        try (FileReader reader = new FileReader("data/input.txt");
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter("data/out.txt",true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String line = bufferedReader.readLine();
            String lineResult = line.replace(stringFind,"");
            System.out.println(lineResult);
            bufferedWriter.write(lineResult);
            bufferedWriter.newLine();
            String lineOut = null;
            while ((lineOut = bufferedReader.readLine()) != null){
                bufferedWriter.write(lineOut, 0 ,lineOut.length());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scan.close();
    }
}
