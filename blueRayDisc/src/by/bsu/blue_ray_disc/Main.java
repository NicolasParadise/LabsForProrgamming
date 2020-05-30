package by.bsu.blue_ray_disc;

import by.bsu.blue_ray_disc.data.BlueRayDisc;

import java.util.Scanner;

/**
 * Create a BlueRayDisc class with an internal class that can be used
 * to store information about directories and subdirectories
 * and records.
 * Создать класс BlueRayDisc с внутренним классом,
 * с помощью объектов которого можно хранить информацию о каталогах, подкаталогах
 * и записях
 * @author Okhotnbitski Nickolas Nickolaevich
 * @since JDK 11.0 LTS
 * @serialData
 * @version
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название диска: ");
        String nameDisc = scan.next();
        System.out.println("Введите название каталога на диске: ");
        String name_cat = scan.next();
        System.out.println("Введите количество папок в каталоге диска: ");
        int numberFol = scan.nextInt();
        System.out.println("Введите названия папок в каталоге: ");
        String[] nameFol = new String[numberFol];
        for(int i=0 ,j=0; i < numberFol; i++, j++){
            System.out.println("Введите имя " + (j+1) + " папки : " );
            nameFol[i] = scan.next();
        }
        System.out.println("Введите количество записей на диске: ");
        int numberRc = scan.nextInt();
        BlueRayDisc disc = new BlueRayDisc(nameDisc, name_cat, numberFol, nameFol, numberRc){
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };

        disc.show();

        scan.close();
    }
}
