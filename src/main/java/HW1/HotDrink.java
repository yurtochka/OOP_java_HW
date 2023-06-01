package HW1;

public abstract class HotDrink extends Product {
    private int temperatureDrink;

    public HotDrink(String nameDrink, int price, double volume, int temperatureDrink) {
        super(nameDrink, price, volume);
        this.temperatureDrink = temperatureDrink;
    }

    @Override
    public String toString() {
        return "Мой любимый напиток " + getNameDrink() +
                ", стоимость которого = " + getPrice() +
                " рублей, удобный объем = " + getVolume() +
                "л, температура = " + getTemperatureDrink() + " градусов.";
    }

    public int getTemperatureDrink() {
        return temperatureDrink;
    }

    public void setTemp(int temperatureDrink) {
        this.temperatureDrink = temperatureDrink;
    }
}
