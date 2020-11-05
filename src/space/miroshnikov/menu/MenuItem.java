package space.miroshnikov.menu;

import java.util.Scanner;

public abstract class MenuItem {
    public String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public abstract void initialize(Scanner inp);
}
