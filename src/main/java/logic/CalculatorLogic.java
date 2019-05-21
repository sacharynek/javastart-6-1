package logic;

public class CalculatorLogic {

    public static boolean isBigger(double a, double b) {
        return a > b;
    }

    public static boolean isEqual(double a, double b) {
        return a == b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double square(double a, double b) {
        return Math.pow(a + b, 2);
    }


}
