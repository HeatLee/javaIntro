package algorithms.sort;

import util.Input;
import util.Printer;

import java.util.Arrays;

public class Task2 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    private static final int ZERO_INDEX = 0;
    private static final int OFFSET = 1;
    private static final int EVEN_DIVISOR = 2;


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {0, 2, 2, 6, 99};
        printer.printArray(mergeSort(arr1, arr2));
    }

    private static int[] mergeSort(int[] firstArr, int[] secondArr) {
        if (firstArr != null && secondArr != null) {
            firstArr = makeNewArr(firstArr, firstArr.length + secondArr.length);
            int i = ZERO_INDEX;
            int j = ZERO_INDEX;
            while (i < secondArr.length && j < firstArr.length) {
                if (secondArr[i] < firstArr[j]) {
                    firstArr = shift(firstArr, j);
                    firstArr[j] = secondArr[i];
                    i++;
                } else {
                    j++;
                }
            }
            return firstArr;
        }
        return new int[]{};
    }

    private static int[] shift(int[] arr, int position) {
        if (arr != null) {
            for (int i = arr.length - OFFSET; i > position; i--) {
                arr[i] = arr[i - OFFSET];
            }
            return arr;
        }
        return new int[]{};
    }
    private static int[] makeNewArr(int[] arr, int newSize) {
        if (arr != null) {
            int size = arr.length;
            arr = Arrays.copyOf(arr, newSize);
            for (int i = size; i < newSize; i++) {
                arr[i] = Integer.MAX_VALUE;
            }
            return arr;
        }
        return new int[]{};
    }
}
