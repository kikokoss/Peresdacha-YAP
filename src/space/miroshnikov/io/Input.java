package space.miroshnikov.io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

// Просто класс для ввода данных с проверками

public class Input {

    //Метод проверки на дурака для int. Пропускает только int.
    public static int readIntWithCheck(Scanner inp, String errorMessage) {

        int result;

        while (true) {
            try {
                result = inp.nextInt();
                inp.nextLine();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(errorMessage);
            }
        }
        return result;
    }

    //Метод проверки на дурака для double. Пропускает только double.
    public static double readDoubleWithCheck(Scanner inp, String errorMessage) {

        double result;

        while (true) {
            try {
                result = inp.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(errorMessage);
            }
        }
        return result;
    }

    public static Calendar readDateWithCheck(Scanner inp) {

        String dateFormat = "dd.MM.yyyy";
        Calendar dateCandidate = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        while (true) {
            try {
                dateCandidate.setTime(sdf.parse(inp.nextLine()));
                break;
            } catch (ParseException e) {
                System.out.println("Недопустимая дата. Попробуйте еще раз. \n");
            } catch (NullPointerException e) {
                System.out.println("Пустая строка. Попробуйте еще раз \n");
                // Пустая строка
            }
        }
        return dateCandidate;
    }

    public static String readStringWithCheck(Scanner inp, String errorMessage) {

        String result;
        while (true) {
            try {
                result = inp.nextLine();
                break;
            } catch (InputMismatchException ex) {
                System.out.println(errorMessage);
            }
        }
        return result;
    }

}
