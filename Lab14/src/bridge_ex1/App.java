package bridge_ex1;

public class App {
    public static void main(String[] args) {
        OperatingSystem window = new WindowOS();
        OperatingSystem mac = new MacOS();
        Computer computer = new Laptop(window);
        computer.startup();
        computer.browserInternet("DesignPattern");
        Computer computer1 = new PC(mac);
        Computer pc = new PC(mac);
        Computer pc2 = new PC(window);


    }
}
