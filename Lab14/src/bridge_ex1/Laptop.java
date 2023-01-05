package bridge_ex1;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    void startup() {
        this.os.startup();
    }

    @Override
    void browserInternet(String url) {
        this.os.loadUrl(url);
    }

    @Override
    boolean canMoveComputer() {
        return true;
    }
}
