package me.yochran.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Executor {

    private static final Scanner scanner = new Scanner(System.in);

    public static void createExecutor() {
        // print command prompt
        System.out.println("Entered CLI. Type your commands below:");

        // loop forever
        while (true) {
            // get the command array
            String[] commandArray = scanner.nextLine().split(" ");

            if (commandArray[0].equalsIgnoreCase("exit")) {
                // log
                System.out.println("Exited CLI.");
                break;
            }

            // get command
            Command command = Register.getCommands().get(commandArray[0]);

            // get the arguments
            List<String> argsList = new ArrayList<>(Arrays.asList(commandArray));
            argsList.remove(commandArray[0]);
            String[] args = argsList.toArray(new String[0]);

            // execute command
            command.execute(args);
        }
    }
}
