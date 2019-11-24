package algorithms.sort;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task4 {
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int OFFSET = 1;
    private static final int ZERO = 0;
    private static final int WRONG_VALUE = -1;
    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND = 20;

    private static Printer printer = new Printer();
    private static ArrayFiller filler = new ArrayFiller();
    private static Input input = new Input();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of items in array: ");
        int[] arr = filler.fillArrayByIntRandomly(n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Array: ");
        printer.printArray(arr);
        printer.print("\nAmount of replaces: " + bubbleSort(arr));
        printer.print("\nSorted array: ");
        printer.printArray(arr);

    }

    private static int bubbleSort(int[] row) {
        if (row != null){
            int replaceAmount = ZERO;
            boolean flag = true;
            while (flag){
                flag = true;
                for (int j = FIRST_ITEM_INDEX; j < row.length - OFFSET; j++) {
                    if (row[j] > row[j + OFFSET]) {
                        flag = false;
                        replaceAmount++;
                        int temp = row[j];
                        row[j] = row[j + OFFSET];
                        row[j + OFFSET] = temp;
                    }
                }
            }
            return replaceAmount;
        }
        return WRONG_VALUE;
    }
}
