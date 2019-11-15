package algorithms.one_dimentional_arrays;

import util.Input;
import util.ArrayFiller;
import util.Printer;

public class Task4 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 100;
    private static final int FIRST_ELEMENT_INDEX = 0;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of array elements: ");
        double[] array = filler.fillArrayByDoubleRandomly(n, RANDOM_MAX_BOUND);
        printer.print("Array: \n");
        printer.printArray(array);
        int maxIndex = findMaxElementIndex(array);
        int minIndex = findMinElementIndex(array);
        printer.print("\nMax Element: " + array[maxIndex]);
        printer.print("\nMin Element: " + array[minIndex]);
        replaceMinAndMaxElements(array, maxIndex, minIndex);
        printer.print("\nAfter replacement: ");
        printer.printArray(array);
    }

    private static int findMaxElementIndex(double[] array) {
        double maxElement = array[FIRST_ELEMENT_INDEX];
        int maxElementIndex = FIRST_ELEMENT_INDEX;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    private static int findMinElementIndex(double[] array) {
        double minElement = array[FIRST_ELEMENT_INDEX];
        int minElementIndex = FIRST_ELEMENT_INDEX;
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }

    private static void replaceMinAndMaxElements(double[] array, int maxElementIndex, int minElementIndex) {
        double buff = array[maxElementIndex];
        array[maxElementIndex] = array[minElementIndex];
        array[minElementIndex] = buff;
    }
}
