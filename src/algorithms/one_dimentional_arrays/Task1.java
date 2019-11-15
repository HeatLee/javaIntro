package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task1 {
    private static final int BOUND = 15;
    private static final Input input = new Input();
    private static final ArrayFiller filler = new ArrayFiller();
    private static final Printer printer = new Printer();

    public static void main(String[] args) {
        int n = input.inputInt("Input size of array: ");
        int[] arr = filler.fillArrayByIntRandomly(n, 100);
        printer.print("Array: ");
        printer.printArray(arr);
        int k = input.inputInt("Input divisor: ");
        int sum = findSumOfMultipleInArray(arr, k);
        printer.print("Sum of multiple by " + k + " is " + sum);
    }

    private static boolean isMultiple(int forCheck, int divisor) {
        return forCheck%divisor == 0;
    }

    private static int findSumOfMultipleInArray(int[] arr, int divisor) {
        int sum = 0;
        for (int el : arr) {
            if (isMultiple(el, divisor)) {
                sum += el;
            }
        }
        return sum;
    }
}
