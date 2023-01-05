package bridge_ex1;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    abstract void startup();

    abstract void browserInternet(String url);

    abstract boolean canMoveComputer();
}
