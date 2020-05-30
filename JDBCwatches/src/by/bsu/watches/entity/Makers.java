package by.bsu.watches.entity;

public class Makers {
    private String maker;
    private String contry;

    public Makers(String maker, String contry) {
        this.maker = maker;
        this.contry = contry;
    }

    public Makers(String maker) {
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    @Override
    public String toString() {
        return "Makers{" +
                "maker='" + maker + '\'' +
                ", contry='" + contry + '\'' +
                '}';
    }
}
