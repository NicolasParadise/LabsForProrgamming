package Laba.Book.A;
import java.util.Scanner;
/**
*Задание заключается в том, чтобы написать программу, которая среди массива
 * чисел находит самое длинное и короткое. Размер массива вводится с клавиатуры
 * и каждый элемент массива тоже. Одно из условий было создания описания программы.
 *
 * @author Охотницкий Николай Николаевич
 * @since JDK 11.0 LTS
*/

public class Main {

    public static void main(String[] args) {
        int minLength=10;
        int maxLength=0;
        String minStr = null, maxStr = null;
        System.out.println("Введите Размер и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Размер "+number);
        String[] Array= new String[number];
        for (int i=0;i<number;i++){
            System.out.println("Введите число из массива и нажмите <Enter>:");
            Array[i] = scan.next();
        }
        for (String elem: Array){
            System.out.println(elem+"  ");
        }
        for(int i=0;i<number;i++){
            if(Array[i].length() < minLength ){
                minLength = Array[i].length();
                minStr =Array[i];
            }
            if(Array[i].length() > maxLength ){
                maxLength = Array[i].length();
                maxStr =Array[i];
            }
        }
        System.out.println("Самое короткое число из массива это: "+minStr+", а его длинна: "+minLength+". " +
                "Самое длинное число из массива это: "+maxStr+", а его длинна: "+maxLength+" .");
        scan.close();
    }
}
