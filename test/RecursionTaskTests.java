import org.junit.jupiter.api.Test;
import space.miroshnikov.tasks.second.Recursion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTaskTests {
    // public void method_scenario_result()

    @Test
    public void calculateDaysBetween_giveTwoCalendars_returnDaysBetween() {
        //arrange
        Recursion testRecursion = new Recursion();
        Calendar firstDate = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        Calendar secondDate = new GregorianCalendar(2020, Calendar.JANUARY, 5);
        //act
        long result = testRecursion.calculateDaysBetween(firstDate, secondDate);
        //assert
        assertEquals(5, result);
    }

    @Test
    public void calendarMax_giveTwoCalendars_returnTheMax() {
        //arrange
        Recursion testRecursion = new Recursion();
        Calendar firstDate = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        Calendar secondDate = new GregorianCalendar(2020, Calendar.JANUARY, 5);
        //act
        Calendar result = testRecursion.calendarMax(firstDate,secondDate);
        //assert
        assertEquals(secondDate, result);
    }

    @Test
    public void calendarMax_giveTwoCalendars_returnTheMin() {
        //arrange
        Recursion testRecursion = new Recursion();
        Calendar firstDate = new GregorianCalendar(2020, Calendar.JANUARY, 1);
        Calendar secondDate = new GregorianCalendar(2020, Calendar.JANUARY, 5);
        //act
        Calendar result = testRecursion.calendarMin(firstDate,secondDate);
        //assert
        assertEquals(firstDate, result);
    }

    @Test
    public void calculateSegmentsForN_giveTwoSegmentWithIntersection_returnTheirIntersectionAsSegment() {
        //arrange
        Recursion testRecursion = new Recursion();
        ArrayList<Calendar> firstSegment = new ArrayList<>();
        firstSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 1));
        firstSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 10));
        ArrayList<Calendar> secondSegment = new ArrayList<>();
        secondSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 5));
        secondSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 15));

        ArrayList<Calendar> resultSegment = new ArrayList<>();
        resultSegment.add(secondSegment.get(0));
        resultSegment.add(firstSegment.get(1));
        //act
        ArrayList<Calendar> resultOfCalc = testRecursion.calculateSegmentsForN(firstSegment, secondSegment);
        //assert
        assertEquals(resultOfCalc, resultSegment);
    }

    @Test
    public void calculateSegmentsForN_giveTwoSegmentWithoutIntersection_returnNull() {
        //arrange
        Recursion testRecursion = new Recursion();
        ArrayList<Calendar> firstSegment = new ArrayList<>();
        firstSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 1));
        firstSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 10));
        ArrayList<Calendar> secondSegment = new ArrayList<>();
        secondSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 11));
        secondSegment.add(new GregorianCalendar(2020, Calendar.JANUARY, 15));

        //act
        ArrayList<Calendar> resultOfCalc = testRecursion.calculateSegmentsForN(firstSegment, secondSegment);
        //assert
        assertNull(resultOfCalc);
    }

    //TO-DO

}
