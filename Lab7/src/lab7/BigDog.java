package lab7;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    public BigDog() {
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }

}
