package space.miroshnikov.tasks;

import java.util.Scanner;

public abstract class Task {

    public String taskName;

    public String getTaskName() {
        return this.taskName;
    }

    public abstract void execute(Scanner inp);
}
