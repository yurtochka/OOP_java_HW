package HW1;


/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
 * 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 */

public class main {
    public static void main(String[] args) {
        HotDrink my_coffee = new Coffee("coffee", 100, 0.5, 90);
        HotDrink my_tea = new Tea("tea", 50, 0.5, 70);
        HotDrink my_chocolate = new Chocolate("chocolate", 70, 0.5, 80);

        VendingMachine hotDrVenMash = new HotDrinksVendingMachine();

        hotDrVenMash.addProduct(my_coffee);
        hotDrVenMash.addProduct(my_tea);
        hotDrVenMash.addProduct(my_chocolate);

        System.out.println(hotDrVenMash.getProduct("chocolate"));
//        System.out.println(hotDrVenMash.getProduct("chocolate", 0.5, 80));
    }
}
