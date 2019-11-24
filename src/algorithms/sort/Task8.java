package algorithms.sort;

import util.ArrayFiller;
import util.BubbleSorter;
import util.Input;
import util.Printer;

public class Task8 {
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int OFFSET = 1;
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final int RANDOM_MIN_BOUND = 1;
    private static final int RANDOM_MAX_BOUND = 10;
    private static final int DEFAULT_COMMON_DENOMINATOR = 1;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static BubbleSorter bubbleSorter = new BubbleSorter();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of fractions: ");
        int[] numerators = filler.fillArrayByIntRandomly(n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        int[] denominators = filler.fillArrayByIntRandomly(n , new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Fractions: ");
        printer.printFractions(numerators, denominators);
        int commonDenominator = findCommonDenominator(denominators);
        leadToCommonDenominator(numerators, denominators, commonDenominator);
        printer.print("\nLeaded and sorted fractions: ");
        printer.printFractions(numerators, commonDenominator);
    }

    private static void leadToCommonDenominator(int[] numerators, int[]denominators, int commonDenominator) {
        for (int i = FIRST_ITEM_INDEX; i < numerators.length; i++) {
            numerators[i] = numerators[i] * (commonDenominator / denominators[i]);
        }
    }

    private static int findCommonDenominator(int[] denominators) {
        int commonDenominator = DEFAULT_COMMON_DENOMINATOR;
        for (int den : denominators) {
            commonDenominator = twoNumbersLCM(commonDenominator, den);
        }
        return commonDenominator;
    }


    private static int twoNumbersLCM(int firstNumber, int secondNumber) {
        int mcd = MCD(firstNumber, secondNumber);
        return (firstNumber * secondNumber) / mcd;
    }

    private static int MCD(int firstNumber, int secondNumber) {
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
