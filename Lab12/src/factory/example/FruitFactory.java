package factory.example;

public class FruitFactory {
    Fruit getFruit(String name) {
        if (name.equals("apple")) {
            return new Apple();
        } else if (name.equals("banana")) {
            return new Banana();
        } else {
            return new Orange();
        }
    }
}
