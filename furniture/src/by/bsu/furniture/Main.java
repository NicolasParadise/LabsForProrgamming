package by.bsu.furniture;

import by.bsu.furniture.data.Wardrobe_of_book;

import java.util.Scanner;

/**
 * interface of the abstract class Cabinet Furniture β β class Bookcase.
 * Создать класс BlueRayDisc с внутренним классом,
 * интерфейс абстрактного класса Мебель ß шкаф ß класс Книжный Шкаф.
 * @author Okhotnbitski Nickolas Nickolaevich
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сколько место шкаф занимает в комнате в квадратных метрах: ");
        double square = scan.nextDouble();
        System.out.println("Введите сколько он может вместить книжек: ");
        int capacity = scan.nextInt();
        System.out.println("Введите сколько в шкафу полок: ");
        int number_shelf = scan.nextInt();
        Wardrobe_of_book wardrobe =  new Wardrobe_of_book(square,number_shelf, capacity);
        wardrobe.accommodation();
        wardrobe.openDoorOfWardrobe();
        wardrobe.cleaning();
        wardrobe.show();

        scan.close();
    }
}
