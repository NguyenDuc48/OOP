package singleton.example;

public class Singleton {
    private static Singleton instance;
    public int number;

    private Singleton(int number) {
        this.number = number;
    }

    public static Singleton getInstance(int number) {
        if (instance == null) {
            instance = new Singleton(number);
        }
        return instance;
    }
}
