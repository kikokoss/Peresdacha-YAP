package space.miroshnikov.tasks.second;

import space.miroshnikov.tasks.Task;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import static space.miroshnikov.io.Input.readDateWithCheck;
import static space.miroshnikov.io.Output.printOutLn;


public class Recursion extends Task {

    public ArrayList<Calendar> firstSegment = new ArrayList<Calendar>();
    public ArrayList<Calendar> secondSegment = new ArrayList<Calendar>();

    @Override
    public void execute(Scanner inp) {

        while (true) {

            this.firstSegment.clear();
            this.secondSegment.clear();

            printOutLn("[!!!] Сейчас на ввод будет приниматся ПЕРВЫЙ отрезок.");
            createSegment(firstSegment, inp);
            printOutLn("[!!!] Сейчас на ввод будет приниматся ВТОРОЙ отрезок.");
            createSegment(secondSegment, inp);

            ArrayList<Calendar> nSegment = calculateSegmentsForN(firstSegment,secondSegment);

            if (nSegment == null) {
                break;
            }


            long n = calculateDaysBetween(nSegment.get(0), nSegment.get(1));
            if (!(n >= 10)) {
                accuratePowerOfTwo(n);
                break;
            } else {
                printOutLn("n больше либо равно 10, попробуйте взять меньший отрезок. \n");
            }
        }

    }

    public long calculateDaysBetween(Calendar firstDate, Calendar secondDate) {
        return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant()) + 1;
    }

    public void accuratePowerOfTwo(long n) {
        if (n == 1) {
            printOutLn("Является точной степенью двойки.");
        } else if ( n % 2 == 0) {
            accuratePowerOfTwo(n / 2);
        } else {
            printOutLn("Не является точной степенью двойки.");
        }
    }

    public void createSegment(ArrayList<Calendar> segment, Scanner inp) {

        segment.clear();
        while (true) {
            printOutLn("Введите первую дату отрезка:");
            Calendar firstDate = readDateWithCheck(inp);
            printOutLn("Введите вторую дату отрезка:");
            Calendar secondDate = readDateWithCheck(inp);
            if (secondDate.compareTo(firstDate) <= 0) {
                printOutLn("Вторая дата меньше первой или ей равна. Проверьте ввод.");
            } else {
                segment.add(firstDate);
                segment.add(secondDate);
                break;
            }
        }

    }

    public ArrayList<Calendar> calculateSegmentsForN(ArrayList<Calendar> firstSegment, ArrayList<Calendar> secondSegment) {
        ArrayList<Calendar> result = new ArrayList<Calendar>();

        if (firstSegment.get(1).compareTo(secondSegment.get(0)) < 0) {
            printOutLn("Ваши отрезки не пересекаются. N будет меньше либо равен нулю. Попробуйте еще раз");
            return null;
        }

        result.add(calendarMax(firstSegment.get(0), secondSegment.get(0)));
        result.add(calendarMin(firstSegment.get(1), secondSegment.get(1)));
        return result;
    }

    public Calendar calendarMax(Calendar first, Calendar second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else if (first.compareTo(second) < 0) {
            return second;
        } else {
            return second;
        }
    }

    public Calendar calendarMin(Calendar first, Calendar second) {
        if (first.compareTo(second) < 0) {
            return first;
        } else if (first.compareTo(second) > 0) {
            return second;
        } else {
            return first;
        }
    }

}
