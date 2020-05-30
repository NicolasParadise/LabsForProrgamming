package Laba.Book.A;
import java.util.Scanner;
import Laba.Book.A.Array;
import Laba.Book.A.Avarage;
/**
 *Задание заключается в том, чтобы написать программу, которая Построить матрицу,
 * вычитая из элементов каждой строки матрицы ее среднее арифметическое. .
 * Размер массива вводится с клавиатуры
 * и каждый элемент массива тоже. Одно из условий было создания описания программы.
 *
 * @author Охотницкий Николай Николаевич
 * @since JDK 11.0 LTS
 * @serialData
 * @version


 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Введите Размер и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Размер "+number);
        Array array = new Array();
        array.setNumber(number);
        array.setArray(number);
        array.showArray();
        System.out.println("-------------------------");
        Avarage ob= new Avarage();
        ob.AvarageMiddle(array);
        scan.close();
    }
}
