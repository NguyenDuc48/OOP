package decorator.example2;

public class App {
    public static void main(String[] args) {
        IceCream chocoIceCream = new ChocolateIceCream();
        HoneyTopping toppingDecorator = new HoneyTopping(chocoIceCream);
        System.out.println(chocoIceCream.getDescription());
        System.out.println(toppingDecorator.addTopping());
    }
}
