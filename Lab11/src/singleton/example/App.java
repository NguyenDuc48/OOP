package singleton.example;


public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(1);
        Singleton singleton1 = Singleton.getInstance(2);
        System.out.println(singleton1.number);
        System.out.println(singleton.number);
    }
}
