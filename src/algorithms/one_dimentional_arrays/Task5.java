package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task5 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 5;
    private static final int FIRST_ELEMENT_INDEX = 0;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of array elements: ");
        int[] array = filler.fillArrayByIntRandomly(n, RANDOM_MAX_BOUND);
        printer.print("Array: ");
        printer.printArray(array);
        printer.print("\nElements satisfying the condition a[i] > i: ");
        if (findElements(array) == 0) {
            printer.print("NONE");
        }
    }

    private static int findElements(int[] array) {
        int counter = 0;
        for (int i = FIRST_ELEMENT_INDEX; i < array.length; i++) {
            if (array[i] > i) {
                counter++;
                printer.print(array[i] +  " ");
            }
        }
        return counter;
    }
}
