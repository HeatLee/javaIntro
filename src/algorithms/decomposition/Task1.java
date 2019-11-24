package algorithms.decomposition;

import util.Input;
import util.Printer;

public class Task1 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;

    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int firstNumber = input.inputInt("Input first number: ");
        int secondNumber = input.inputInt("Input second number: ");
        printer.print("\nGCF: " + GCF(firstNumber, secondNumber));
        printer.print("\nLCM: " + twoNumbersLCM(firstNumber, secondNumber));

    }

    private static int twoNumbersLCM(int firstNumber, int secondNumber) {
        int mcd = GCF(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / mcd;
    }

    private static int GCF(int firstNumber, int secondNumber) {
        if (firstNumber != ZERO && secondNumber != ZERO) {
            firstNumber = Math.abs(firstNumber);
            secondNumber = Math.abs(secondNumber);
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
