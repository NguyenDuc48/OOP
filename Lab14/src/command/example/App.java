package command.example;


public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        MySwitch mySwitch = new MySwitch();
        RestartCommand restartCommand1 = new RestartCommand(computer1);
        ShutDownCommand shutDownCommand1 = new ShutDownCommand(computer1);

        RestartCommand restartCommand2 = new RestartCommand(computer2);
        ShutDownCommand shutDownCommand2 = new ShutDownCommand(computer2);
        mySwitch.storeAndExecute(restartCommand1);
        mySwitch.storeAndExecute(shutDownCommand1);
        System.out.println();

    }
}
