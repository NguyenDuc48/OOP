package command.example;

import java.util.LinkedList;
import java.util.List;

public class MySwitch {
    private List<Command> hisCommands;

    public MySwitch() {
        this.hisCommands = new LinkedList<>();
    }

    public void execute(Command command) {
        command.execute();
    }

    public void store(Command command) {
        this.hisCommands.add(command);
    }

    public void storeAndExecute(Command command) {
        store(command);
        execute(command);
    }

    public void executeAll() {
        for (Command c : hisCommands
        ) {
            c.execute();
        }
    }
}
