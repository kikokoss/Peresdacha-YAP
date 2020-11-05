package space.miroshnikov.io;

public class Output {

    public static void printOutLn(String string) {
        System.out.println(string);
    }

    public static void printFormula(double x, double y, double z, double result) {
        System.out.printf("(%.3f + %.3f^(1/2)) / %.3f 1= %.3f \n", x, y, z, result);
    }

    public static void printItems(int i, String title) {
        System.out.printf("[%d] %s\n", i, title);
    }
}
