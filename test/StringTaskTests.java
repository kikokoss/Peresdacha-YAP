import org.junit.jupiter.api.Test;
import space.miroshnikov.tasks.third.StringJob;
import space.miroshnikov.tasks.third.ValidationException;

import static org.junit.jupiter.api.Assertions.*;

public class StringTaskTests {
    // public void method_scenario_result()

    @Test
    public void stringsEquality_twoEqualStrings_theyAreEqual() {
        //arrange
        StringJob testStringJob = new StringJob();
        //act
        boolean result = testStringJob.stringsEquality("abc", "abc");
        //assert
        assertTrue(result);
    }

    @Test
    public void stringsEquality_twoNotEqualStrings_theyAreNotEqual() {
        //arrange
        StringJob testStringJob = new StringJob();
        //act
        boolean result = testStringJob.stringsEquality("abc", "aBc");
        //assert
        assertFalse(result);
    }

    @Test
    public void stringsTrueEquality_twoTrueEqualStrings_theyAreTrueEqual() {
        //arrange
        StringJob testStringJob = new StringJob();
        //act
        boolean result = testStringJob.stringsTrueEquality("a B c", "AbC");
        //assert
        assertTrue(result);
    }

    @Test
    public void reverseString_shareAWord_returnReversed() {
        //arrange
        StringJob testStringJob = new StringJob();
        String input = "thisisinput";
        String expected = "tupnisisiht";
        //act
        String result = testStringJob.reverseString(input);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void checkStringForRegex_notPhoneNotMailNotIP_throwException() {
        //arrange
        StringJob testStringJob = new StringJob();
        String input = "+7notaphoneiporemail@test";
        //act
        ValidationException e = assertThrows(ValidationException.class, () ->
                testStringJob.checkStringForRegex(input, ""));
        //assert
        assertEquals("Не почтой, не телефоном и не IPv4 адресом", e.getMessage());
    }
}
