package lab7;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
