package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task8 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 5;
    private static final int FIRST_ARRAY_ELEMENT_INDEX = 0;
    private static final int SECOND_ARRAY_ELEMENT_INDEX = 1;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of elements in array: ");
        int[] array = filler.fillArrayByIntRandomly(n, RANDOM_MAX_BOUND);
        printer.print("Array: ");
        printer.printArray(array);
        int minElement = findMinElement(array);
        printer.print("\nMin Element = " + minElement);
        printer.print("\nArray without minimal element: ");
        printer.printArray(deleteAllMinElements(array, minElement));
    }

    private static int findMinElement(int[] array) {
        int minElement = array[FIRST_ARRAY_ELEMENT_INDEX];
        for (int i = SECOND_ARRAY_ELEMENT_INDEX; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    private static int[] deleteAllMinElements(int[] array, int minElement) {
        for (int i = FIRST_ARRAY_ELEMENT_INDEX; i < array.length; i++) {
            if (array[i] == minElement) {
                array = filler.deleteElementByIndex(array, i);
            }
        }
        return array;
    }
}
