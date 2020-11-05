package MenuTests;

import org.junit.jupiter.api.Test;
import space.miroshnikov.menu.MenuItem;
import space.miroshnikov.menu.MenuItemExit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MenuItemsExitTests {

    @Test
    public void getTitle_creatingItem_titleReturned() {
        //arrange
        MenuItem test = new MenuItemExit();
        //act
        String result = test.getTitle();
        //assert
        assertEquals("Exit the program", result);
    }
}