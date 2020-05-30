package by.bsu.number_letter;

import by.bsu.number_letter.info.Symbol;
import by.bsu.number_letter.info.Word;
import by.bsu.number_letter.sort.Input;
import by.bsu.number_letter.sort.SortWord;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("data/input.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите необходимы символ: ");
            String sym = scanner.next();
            char symb = sym.charAt(sym.length() - 1);
            Symbol symbol = new Symbol(symb);
            String line = bufferedReader.readLine();
            line = line.replace(".", "");
            line = line.replace(",", "");
            String regex = "(\\s+)";
            String[] line1 = line.split(regex);
            Word[] word = new Word[line1.length];
            for (int i = 0; i < line1.length; i++) {
                word[i] = new Word(line1[i]);
            }
            Input.InputChar(word,symbol);
            System.out.println("А теперь, выведутся слова, которые имеют данный символ, но отсортированные по убыванию количества данного символа: ");
            SortWord.Sort(word);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

