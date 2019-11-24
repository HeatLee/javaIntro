package algorithms.decomposition;

import util.Input;
import util.Printer;

public class Task6 {
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final int RANDOM_MIN_VALUE = -10;
    private static final int RANDOM_MAX_VALUR = 10;
    private static final int AMOUNT_OF_NUMBERS = 3;

    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int firstNumber = input.inputInt("Input first number");
        int secondNumber = input.inputInt("Input second number");
        int thirdNumber = input.inputInt("Input third number");
        System.out.println(isMutuallySimple(firstNumber, secondNumber, thirdNumber));
    }

    private static boolean isMutuallySimple(int first, int second, int third) {
        return GCF(first, GCF(second, third)) == 1;
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
