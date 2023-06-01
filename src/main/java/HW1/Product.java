package HW1;

import java.math.BigDecimal;

public abstract class Product {
    private String nameDrink;
    private int price;
    private double volume;

    public Product(String nameDrink, int price, double volume) {
        this.nameDrink = nameDrink;
        this.price = price;
        this.volume = volume;
    }


    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

}
