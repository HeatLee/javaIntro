package algorithms.decomposition;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task8 {
    private static final int OFFSET = 3;
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int ZERO_VALUE = 0;
    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND = 10;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of elements in array: ");
        double[] array = filler.fillArrayByDoubleRandomly(n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Array: ");
        printer.printArray(array);
        printer.print("\nSums: ");
        printer.printArray(calcSumsOfArray(array));
    }

    private static double[] calcSumsOfArray(double[] array) {
        double[] sums = new double[]{};
            for (int i = FIRST_ITEM_INDEX; i < array.length - OFFSET; i += OFFSET) {
                double newSum = calcSumOfThreeItemsFromPos(array, i);
                if (newSum != Double.NEGATIVE_INFINITY) {
                    sums = filler.addElement(sums, newSum);
                }
            }
        return sums;
    }

    private static double calcSumOfThreeItemsFromPos(double[] array, int position) {
        double sum = ZERO_VALUE;
        try {
            for (int i = position; i < position + OFFSET; i++) {
                sum += array[i];
            }
        } catch (IndexOutOfBoundsException e) {
            sum = Double.NEGATIVE_INFINITY;
        }
        return sum;
    }
}
