package space.miroshnikov.menu;

import space.miroshnikov.tasks.second.Recursion;

import java.util.Scanner;

import static space.miroshnikov.io.Output.printOutLn;

public class MenuItemRecursion extends MenuItem {

    public MenuItemRecursion() {
        this.title = "Точная степень двойки";
    }


    @Override
    public void initialize(Scanner inp) {
        printOutLn("Даты должны быть в формате ДД.ММ.ГГГГ");
        new Recursion().execute(inp);
    }
}
