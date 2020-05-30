package by.bsu.task.product;
import by.bsu.task.product.Product;
import by.bsu.task.product.Search;

import java.util.Scanner;

/**
 * Product: id, Наименование, UPC, Производитель, Цена, Срок хранения, Количество.
 * Создать массив объектов. Вывести: a) список товаров для заданного наименования;
 * b) список товаров для заданного наименования, цена которых не превосходит заданную;
 * c) список товаров, срок хранения которых больше заданного.
 * @author Охотницкий Николай Николаевич
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество разнновидностей товара:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Количество "+number);
        Product[] List = new Product[number];
        String[] NameProduct = new String[number];
        String[] Id = new String[number];
        String[] MadeInName = new String[number];
        int[] UPC = new int[number];
        int[] DateSavedMonth = new int[number];
        int[] NumberProduct = new int[number];
        double[] Price = new double[number];
        for(int i=0;i<number;i++) {
            int j=0;
            System.out.println("Введите название "+ (j+1) +" продукта:");
            NameProduct[i] = scan.next();
            System.out.println("Введите название производителя "+ (j+1) +" продукта:");
            MadeInName[i] = scan.next();
            System.out.println("Введите Id "+ (j+1) +" продукта:");
            Id[i] = scan.next();
            System.out.println("Введите код UPC "+ (j+1) +" продукта:");
            UPC[i]= scan.nextInt();
            System.out.println("Введите количество "+ (j+1) +" продукта:");
            NumberProduct[i]= scan.nextInt();
            System.out.println("Введите срок хранения в месяцах "+ (j+1) +" продукта:");
            DateSavedMonth[i]= scan.nextInt();
            System.out.println("Введите цену "+ (j+1) +" продукта:");
            Price[i]= scan.nextDouble();
        }
        for(int i=0;i<number;i++){
            List[i]=new Product(Id[i],NameProduct[i],MadeInName[i],UPC[i],DateSavedMonth[i],NumberProduct[i], Price[i]);
        }

        System.out.println("Введите название продукта, которого нужна найти: ");
        String NameSearch1 = scan.next();
        Search Search1 = new Search(List,NameSearch1);
        Search1.SearchFunction(List,NameSearch1);

        System.out.println("Введите название продукта и цену: ");
        String NameSearch2 = scan.next();
        double price2 = scan.nextDouble();
        Search Search2 = new Search(List,NameSearch2,price2);
        System.out.println("Продукция определённого товара, цены которого меньше заданной: ");
        Search2.SearchFunction(List,NameSearch2,price2);

        System.out.println("Введите срок годности товара в месяцах: ");
        int Date3= scan.nextInt();
        Search Search3 = new Search(List,Date3);
        System.out.println("Товары, срок годности которых больше заданного: ");
        Search1.SearchFunction(List,Date3);

        scan.close();
    }
}
