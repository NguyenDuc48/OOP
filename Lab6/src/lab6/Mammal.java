package lab6;

public class Mammal extends Animal {
    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "}";
    }
}
