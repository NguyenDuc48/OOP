package bridge_ex1;

public class WindowOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowOS is starting");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowOS is loading " + url);
    }
}
