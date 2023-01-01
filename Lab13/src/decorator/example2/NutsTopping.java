package decorator.example2;

public class NutsTopping extends ToppingDecorator {
    public NutsTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String addTopping() {
        return this.getDescription() + " nuts topping";
    }
}
