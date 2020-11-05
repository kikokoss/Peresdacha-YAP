package space.miroshnikov.menu;

import space.miroshnikov.tasks.third.StringJob;

import java.util.Scanner;

public class MenuItemStringJob extends MenuItem {

    public MenuItemStringJob() {
        this.title = "Работа со строками";
    }

    @Override
    public void initialize(Scanner inp) {
        new StringJob().execute(inp);
    }
}
