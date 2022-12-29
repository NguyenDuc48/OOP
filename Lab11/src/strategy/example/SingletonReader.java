package strategy.example;


import java.io.BufferedReader;

public class SingletonReader {

    private static SingletonReader instance;
    public BufferedReader reader;

    private SingletonReader(BufferedReader reader) {
        this.reader = reader;
    }

    public static SingletonReader setInstance(BufferedReader reader) {
        if (instance == null) {
            instance = new SingletonReader(reader);
        }
        return instance;
    }
}
