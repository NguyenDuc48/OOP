package lab7;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        cat1.greets();
        Dog dog1 = new Dog("dog1");
        dog1.greets();
        BigDog bigDog1 = new BigDog("bigdog1");
        bigDog1.greets();

        Animal animal1 = new Cat();
        animal1.greets();

        Animal animal2 = new Dog();
        animal2.greets();

        Animal animal3 = new BigDog();
        animal3.greets();
    }
}
