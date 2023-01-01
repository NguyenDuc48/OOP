package decorator.example2;

public abstract class ToppingDecorator implements IceCream {

    private IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription();
    }

    public abstract String addTopping();
}
