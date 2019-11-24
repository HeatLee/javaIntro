package algorithms.decomposition;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task5 {
    private static final int ZERO_INDEX = 0;
    private static final int WRONG_VALUE = -1;
    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND = 10;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of items: ");
        int[] arr = filler.fillArrayByIntRandomly(n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Array: ");
        printer.printArray(arr);
        printer.print("\nSecond max: " + findSecondMax(arr));
    }

    private static int findSecondMax(int[] arr) {
        if (arr != null) {
            int max = findMax(arr);
            int secondMax = Integer.MIN_VALUE;
            for (int i = ZERO_INDEX; i < arr.length; i++) {
                if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }
            return secondMax;
        }
        return WRONG_VALUE;
    }

    private static int findMax(int[] arr) {
        if (arr != null) {
            int max = Integer.MIN_VALUE;
            for (int i = ZERO_INDEX; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
        return WRONG_VALUE;
    }
}
