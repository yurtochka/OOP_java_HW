package HW1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private final List<HotDrink> HotDrinksList;

    public HotDrinksVendingMachine() {
        HotDrinksList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        HotDrinksList.add((HotDrink) product);
    }


    public Product getProduct(String nameDrink) {
        for (Product product : HotDrinksList) {
            if (nameDrink.equals(product.getNameDrink())) return product;
        }
        return null;
    }


    public HotDrink getProduct(String nameDrink, BigDecimal volume, BigDecimal temperatureDrink) {
        for (HotDrink product : HotDrinksList) {
            if (nameDrink.equals(product.getNameDrink()) && volume.equals(product.getVolume()) && temperatureDrink.equals(product.getTemperatureDrink()))
                return product;
        }
        return null;
    }

}
