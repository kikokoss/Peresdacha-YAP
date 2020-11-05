package space.miroshnikov.menu;

import space.miroshnikov.tasks.first.Formula;

import java.util.Scanner;

import static space.miroshnikov.io.Output.printOutLn;

public class MenuItemFormula extends MenuItem {

    public MenuItemFormula() {
        this.title = "Посчитать формулу";
    }

    @Override
    public void initialize(Scanner inp) {
        printOutLn("Будет вычислятся следующая формула: (x + y^(1/2)) / z");
        new Formula().execute(inp);
    }
}
