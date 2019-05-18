package logic;

import java.util.Scanner;

public class CalculatorLogic {

    private double a, b;

    public CalculatorLogic() {
    }

    public CalculatorLogic(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static boolean isBigger(double a, double b){
        return a>b;
    }

    public static boolean isEqual(double a, double b){
        return a == b;
    }

    public static double sum(double a, double b){ return a+b;}

    public static double multiply(double a, double b){return a*b;}

    public static double square(double a, double b){
        return Math.pow(a+b,2);
    }

    public static double podajLiczbe(int i){
        Scanner sc = new Scanner(System.in);
        System.out.format("Podaj liczbe %d :", i);
        double output = sc.nextDouble();
        return output;
    }

    @Override
    public String toString() {
        return "CalculatorLogic{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
