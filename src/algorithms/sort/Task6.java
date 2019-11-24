package algorithms.sort;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task6 {
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int HALF_DIVISOR = 2;
    private static final int OFFSET = 1;
    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND = 10;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of array items: ");
        double[] array = filler.fillArrayByDoubleRandomly(n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Array: ");
        printer.printArray(array);
        sort(array);
        printer.print("\nSorted array: ");
        printer.printArray(array);
    }

    private static void sort (double[] arr)
    {
        for (int inc = arr.length / HALF_DIVISOR; inc >= OFFSET; inc = inc / HALF_DIVISOR)
            for (int step = FIRST_ITEM_INDEX; step < inc; step++)
                insertionSort (arr, step, inc);
    }

    private static void insertionSort (double[] arr, int start, int inc)
    {
        double tmp;
        for (int i = start; i < arr.length - OFFSET; i += inc)
            for (int j = Math.min(i+inc, arr.length-1); j-inc >= FIRST_ITEM_INDEX; j = j-inc)
                if (arr[j - inc] > arr[j])
                {
                    tmp = arr[j];
                    arr[j] = arr[j-inc];
                    arr[j-inc] = tmp;
                }
                else break;
    }
}
