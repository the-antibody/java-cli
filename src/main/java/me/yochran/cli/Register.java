package me.yochran.cli;

import java.util.HashMap;
import java.util.Map;

public class Register {

    private static final Map<String, Command> commands;

    static {
        commands = new HashMap<>();
    }

    // get the commands
    public static Map<String, Command> getCommands() { return commands; }

    /**
     * Register a command
     * @param command - the class to register from
     */
    public static void registerCommand(String name, Command command) {
        getCommands().put(name, command);
    }
}
