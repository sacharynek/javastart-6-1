package logic;

import java.util.Scanner;

public class CalculatorLogic {


    public CalculatorLogic() {
    }

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

    public static double podajLiczbe(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.format("Podaj liczbe %d :", i);
        return sc.nextDouble();
    }
}
