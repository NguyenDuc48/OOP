package decorator.example2;

public class HoneyTopping extends ToppingDecorator {
    public HoneyTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return this.getDescription() + "honey topping";
    }
}
