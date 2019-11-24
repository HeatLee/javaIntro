package algorithms.decomposition;

import util.Input;
import util.Printer;

public class Task2 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;

    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int firstNumber = input.inputInt("Input first number");
        int secondNumber = input.inputInt("Input second number: ");
        int thirdNumber = input.inputInt("Input third number: ");
        int fourthNumber = input.inputInt("Input fourth number: ");
        printer.print("GCD: " + fourNumbersGCD(firstNumber, secondNumber, thirdNumber, fourthNumber));
    }

    private static int fourNumbersGCD(int first, int second, int third, int fourth) {
        if (first > ZERO && second > ZERO && third > ZERO && fourth > ZERO) {
            return GCD(GCD(first, second), GCD(third, fourth));
        }
        return WRONG_VALUE;
    }

    private static int GCD(int firstNumber, int secondNumber) {
        if (firstNumber != ZERO && secondNumber != ZERO) {
            while (firstNumber != ZERO && secondNumber != ZERO) {
                if (firstNumber > secondNumber) {
                    firstNumber %= secondNumber;
                } else {
                    secondNumber %= firstNumber;
                }
            }
            if (firstNumber > ZERO) {
                return firstNumber;
            } else {
                return secondNumber;
            }
        }
        return WRONG_VALUE;
    }
}
