package space.miroshnikov;

import space.miroshnikov.menu.*;

import java.util.ArrayList;
import java.util.Scanner;

import static space.miroshnikov.io.Input.readIntWithCheck;
import static space.miroshnikov.io.Output.printItems;
import static space.miroshnikov.io.Output.printOutLn;

public class Menu {

    public static ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    private static Scanner inp = new Scanner(System.in);

    public Menu() {
        getMenuItems();
        printMenuItems();
        menuChooser(inp);
    }


    private static void getMenuItems() {

        if (menuItems.size() == 0) {
            menuItems.add(new MenuItemExit());
            menuItems.add(new MenuItemHelloWorld());
            menuItems.add(new MenuItemFormula());
            menuItems.add(new MenuItemRecursion());
            menuItems.add(new MenuItemStringJob());
        }
    }

    public static void printMenuItems() {

        printOutLn("=============================================");
        printOutLn("Дмитрий Мирошников. Лабараторная работа. 4 Семестр. Пересдача.");
        for (int i = 0; i < menuItems.size(); i++) {
            printItems(i, menuItems.get(i).getTitle());
        }
        printOutLn("=============================================");
    }

    public static void menuChooser(Scanner inp) {

        boolean exit = false;

        do {
            printOutLn("Введите номер пункта меню: ");
            int key = readIntWithCheck(inp,"Не верный ввод. Должно быть число");
            switch (key) {
                case (0):
                    menuItems.get(0).initialize(inp);
                    break;
                case (1):
                    menuItems.get(1).initialize(inp);
                    exit = true;
                    break;
                case (2):
                    menuItems.get(2).initialize(inp);
                    exit = true;
                    break;
                case (3):
                    menuItems.get(3).initialize(inp);
                    exit = true;
                    break;
                case (4):
                    menuItems.get(4).initialize(inp);
                    exit = true;
                    break;
                default:
                    printOutLn("Введенное значение не соответствует ни одному из меню.");
                    printOutLn("Попробуйте еще раз: ");
                    break;
            }
        } while (!exit);
    }

}

