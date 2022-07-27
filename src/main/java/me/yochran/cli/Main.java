package me.yochran.cli;

import me.yochran.cli.commands.TestCommand;

public class Main {
    public static void main(String[] args) {
        // register our test command
        Register.registerCommand("test", new TestCommand());

        // create executor
        Executor.createExecutor();
    }
}