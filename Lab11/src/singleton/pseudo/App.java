package singleton.pseudo;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton singleton1 = Singleton.getInstance("FAA");
        System.out.println(singleton1.value);
        System.out.println(singleton.value);
    }
}
