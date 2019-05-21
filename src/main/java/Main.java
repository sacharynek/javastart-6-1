import logic.CalculatorLogic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe nr 1");
        double first = sc.nextDouble();
        System.out.println("podaj liczbe nr 2");
        double second = sc.nextDouble();
        if (CalculatorLogic.isBigger(first, second)) {
            System.out.println(CalculatorLogic.sum(first, second));
        } else if (CalculatorLogic.isEqual(first, second)) {
            System.out.println(CalculatorLogic.square(first, second));
        } else {
            System.out.println(CalculatorLogic.multiply(first, second));
        }

    }
}
