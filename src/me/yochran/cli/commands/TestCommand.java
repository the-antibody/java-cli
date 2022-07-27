package me.yochran.cli.commands;

import me.yochran.cli.Command;

public class TestCommand implements Command {

    @Override
    public void execute(String[] args) {
        // print hello world
        System.out.println("Hello World!");

        // print the arguments
        System.out.println("The arguments are: ");

        // create argument index
        for (int i = 0; i < args.length; i++)
            System.out.println(i + ": " + args[i]);
    }
}
