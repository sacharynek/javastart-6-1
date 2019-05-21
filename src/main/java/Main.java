import logic.CalculatorLogic;

public class Main {

    public static void main(String[] args) {
        double first = CalculatorLogic.podajLiczbe(1);
        double second = CalculatorLogic.podajLiczbe(2);
        if (CalculatorLogic.isBigger(first, second)) {
            System.out.println(CalculatorLogic.sum(first, second));
        } else if (CalculatorLogic.isEqual(first, second)) {
            System.out.println(CalculatorLogic.square(first, second));
        } else {
            System.out.println(CalculatorLogic.multiply(first, second));
        }

    }
}
