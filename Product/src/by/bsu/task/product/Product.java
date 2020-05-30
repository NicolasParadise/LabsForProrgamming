package by.bsu.task.product;

import java.text.DecimalFormat;

public class Product {
    private String Id;
    private String NameProduct;
    private int UPC;
    private String MadeInName;
    private double Price;
    private int DateSavedMonth;
    private int NumberProduct;

    public void setId(String Id1) {
        Id = Id1;
    }

    public void setNameProduct(String Name) {
        NameProduct = Name;
    }

    public void setUPC(int upc) {
        UPC = upc;
    }

    public void setMadeInName(String MadeName) {
        MadeInName = MadeName;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setDateSavedMonth(int Month) {
        DateSavedMonth = Month;
    }

    public void setNumberProduct(int number) {
        NumberProduct = number;
    }

    public String getId() {
        return Id;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public String getMadeInName() {
        return MadeInName;
    }

    public int getUPC() {
        return UPC;
    }

    public int getDateSavedMonth() {
        return DateSavedMonth;
    }

    public int getNumberProduct() {
        return NumberProduct;
    }

    public double getPrice() {
        return Price;
    }

    public Product(String Id1, String Name, String MadeName, int upc, int month, int number, double price) {
        Id = Id1;
        NameProduct = Name;
        MadeInName = MadeName;
        UPC = upc;
        DateSavedMonth = month;
        NumberProduct = number;
        Price = price;
    }

    public Product(String Name, String MadeName, int number, double price) {
        Id = "Неизвестно";
        NameProduct = Name;
        MadeInName = MadeName;
        UPC = 0;
        DateSavedMonth = 0;
        NumberProduct = number;
        Price = price;
    }

    public Product(String MadeName, int upc, int month, int number, double price) {
        Id = "Неизвестно";
        NameProduct = "Неизвестно";
        MadeInName = MadeName;
        UPC = upc;
        DateSavedMonth = 0;
        NumberProduct = number;
        Price = 0;
    }

    public Product() {
        Id = "Неизвестно";
        NameProduct = "Неизвестно";
        MadeInName = "Неизвестно";
        UPC = 0;
        DateSavedMonth = 0;
        NumberProduct = 0;
        Price = 0;
    }
    public void show(){
        System.out.println("Id продукта:" + Id);
        System.out.println("Название продукта:" + NameProduct);
        System.out.println("Название производителя продукта:" + MadeInName);
        System.out.println("Код UPC продукта:" + UPC);
        System.out.println("Срок хранения продукта(в месяцах):" + DateSavedMonth);
        System.out.println("Число продукта:" + NumberProduct);
        System.out.println("Цена продукта:" + Price);
        System.out.println("------------------------");
    }
}
