package space.miroshnikov.menu;

import java.util.Scanner;

public class MenuItemExit extends MenuItem {

    public MenuItemExit() {
        this.title = "Закрыть программу";
    }

    @Override
    public void initialize(Scanner inp) {
        System.exit(0);
    }
}
