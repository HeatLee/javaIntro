package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task10 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int FIRST_ITEM_INDEX = 0;
    private static final int EVEN_DIVISOR = 2;
    private static final int ZERO_VALUE = 0;
    private static final int RANDOM_MAX_BOUND = 10;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of items in array: ");
        int[] array = filler.fillArrayByIntRandomly(n, RANDOM_MAX_BOUND);
        printer.print("Array: ");
        printer.printArray(array);
        replaceEvenElementsByZero(array);
        archive(array);
        printer.print("Archived array: ");
        printer.printArray(array);
    }

    private static void archive(int[] array) {
        for (int i = 0; i <= findLastNonZeroItem(array); i++) {
            if (array[i] == ZERO_VALUE) {
                int temp = findLastNonZeroItem(array);
                array[i] = array[temp];
                array[temp] = ZERO_VALUE;
            }
        }
    }

    private static void replaceEvenElementsByZero(int[] array) {
        for (int i = FIRST_ITEM_INDEX; i < array.length; i++) {
            if (i % EVEN_DIVISOR == ZERO_VALUE) {
                array[i] = ZERO_VALUE;
            }
        }
    }

    private static int findLastNonZeroItem(int[] array) {
        int itemIndex = array.length - 1;
        for (int i = itemIndex; i >= 0; i--) {
            if (array[i] != ZERO_VALUE) {
                itemIndex = i;
                break;
            }
        }
        return itemIndex;
    }
}
