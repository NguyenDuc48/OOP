package adapter.example;

public class App {
    public static void main(String[] args) {
        ToyDuck toyDuck = new PlasticToyDuck();
        Bird sparrow = new Sparrow();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
