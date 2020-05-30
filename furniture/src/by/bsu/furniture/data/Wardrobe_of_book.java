package by.bsu.furniture.data;

public class Wardrobe_of_book extends Wardrobe implements Furniture{

    private int number_of_shelf;
    private int capacity_of_books;

    public Wardrobe_of_book(double square, int number_of_shelf, int capacity_of_books) {
        super(square);
        this.number_of_shelf = number_of_shelf;
        this.capacity_of_books = capacity_of_books;
    }

    public Wardrobe_of_book(double square) {
        super(square);
        number_of_shelf = 0;
        capacity_of_books = 0;
    }

    public int getNumber_of_shelf() {
        return number_of_shelf;
    }

    public void setNumber_of_shelf(int number_of_shelf) {
        this.number_of_shelf = number_of_shelf;
    }

    public int getCapacity_of_books() {
        return capacity_of_books;
    }

    public void setCapacity_of_books(int capacity_of_books) {
        this.capacity_of_books = capacity_of_books;
    }

    public void cleaning(){
        System.out.println("Шкаф протёрт от пыли!)");
    }

    public void accommodation(){
        System.out.println("Шкаф перемещён в другой угол комнаты)");
    }

    public void openDoorOfWardrobe(){
        System.out.println("Сколько же тут пыли!");
    }

    public void show(){
        System.out.println("Шкаф у нас имеет " + this.getNumber_of_shelf() + " полок, " + this.getCapacity_of_books() +
                " книг может в себя вместить и " + this.getSquare() + " метров квадратных занимает места.");
    }
}
