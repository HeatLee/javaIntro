package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task7 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 100;
    private static final int FIRST_ARRAY_ELEMENT = 0;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of elements: ");
        double[] array = filler.fillArrayByDoubleRandomly(n, RANDOM_MAX_BOUND);
        printer.print("Array: ");
        printer.printArray(array);
        double[] sums = new double[array.length / 2];
        findSums(array, sums);
        printer.print("\nSums: ");
        printer.printArray(sums);
        printer.print("\nMax element: " + max(sums));
    }

    private static void findSums(double[] dataArray, double[] sums) {
        for (int i = 0, j = dataArray.length-1; i != j; i++, j--) {
            sums[i] = dataArray[i] + dataArray[j];
        }
    }

    private static double max(double[] array) {
        double maxElement = array[FIRST_ARRAY_ELEMENT];
        for (double el : array) {
            if (el > maxElement) {
                maxElement = el;
            }
        }
        return maxElement;
    }
}
