package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task9 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 10;
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int SECOND_ITEM_INDEX = 1;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of array items: ");
        printer.print("Array: ");
        int[] array = filler.fillArrayByIntRandomly(n, RANDOM_MAX_BOUND);
        printer.printArray(array);
        int[] result = findMaxCountedElement(array);
        printer.print(String.format("Most common value: %d Amount of inputs: %d",
                result[FIRST_ITEM_INDEX], result[SECOND_ITEM_INDEX]));
    }

    private static int[] findMaxCountedElement(int[] array){
        int maxCount = 0;
        int maxCountElement = array[FIRST_ITEM_INDEX];
        for (int element : array) {
            int count = countItem(array, element);
            if (count > maxCount) {
                maxCount = count;
                maxCountElement = element;
            } else if (count == maxCount) {
                maxCountElement = (element < maxCountElement) ? element : maxCountElement;
            }
        }
        return new int[]{maxCountElement, maxCount};
    }

    private static int countItem(int[] array, int item) {
        int counter = 0;
        for (int element : array) {
            if (element == item) {
                counter++;
            }
        }
        return counter;
    }

    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}
