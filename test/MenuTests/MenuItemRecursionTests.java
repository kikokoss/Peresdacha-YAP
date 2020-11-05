package MenuTests;

import org.junit.jupiter.api.Test;
import space.miroshnikov.menu.MenuItem;
import space.miroshnikov.menu.MenuItemRecursion;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MenuItemRecursionTests {

    @Test
    public void getTitle_creatingItem_titleReturned() {
        //arrange
        MenuItem test = new MenuItemRecursion();
        //act
        String result = test.getTitle();
        //assert
        assertEquals("Accurate power of two", result);
    }
}
