package bridge_ex1;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS is starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("MacOS is loading " + url);
    }
}
