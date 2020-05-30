package by.bsu.watches.entity;

public class Watches {
    private String maker;
    private String type;
    private int price;
    private int number;
    private String requisites;

    public Watches(String maker, String type, int price, int number, String requisites) {
        this.maker = maker;
        this.type = type;
        this.price = price;
        this.number = number;
        this.requisites = requisites;
    }

    public Watches(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public String toString() {
        return "Watches{" +
                "maker='" + maker + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", requisites='" + requisites + '\'' +
                '}';
    }
}
