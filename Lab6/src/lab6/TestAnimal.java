package lab6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Mickey");
        System.out.println(animal);
        Mammal mammal = new Mammal("Mickey");
        System.out.println(mammal);
        Cat cat = new Cat("Bi");
        System.out.println(cat);
        Dog dog = new Dog("Mil");
        System.out.println(dog);
    }
}
