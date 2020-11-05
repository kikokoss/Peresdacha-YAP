package space.miroshnikov.menu;

import space.miroshnikov.tasks.first.HelloWorld;

import java.util.Scanner;

public class MenuItemHelloWorld extends MenuItem {

    public MenuItemHelloWorld() {
        this.title = "Вывести 'Hello, world!'";
    }


    @Override
    public void initialize(Scanner inp) {
        new HelloWorld().execute(inp);
    }
}
