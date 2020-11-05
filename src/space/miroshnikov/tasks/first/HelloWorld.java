package space.miroshnikov.tasks.first;

import space.miroshnikov.tasks.Task;

import java.util.Scanner;

import static space.miroshnikov.io.Output.printOutLn;

public class HelloWorld extends Task {

    public String taskName = "Hello World";

    @Override
    public void execute(Scanner inp) {
        printOutLn("Hello, World!");
    }

}
