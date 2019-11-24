package algorithms.sort;

import util.ArrayFiller;
import util.Printer;

public class Task5 {
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int OFFSET = 1;
    private static final int HALF_DIVISOR = 2;

    private static Printer printer = new Printer();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int[] array = filler.fillArrayByIntRandomly(10, new int[]{-10, 10});
        printer.print("\nArray: ");
        printer.printArray(array);
        printer.print("\nSorted array: ");
        insertSort(array);
        printer.printArray(array);
    }

    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int curElement = array[i];
            int insertionPos = binarySearch(array, i, curElement);
            if (array[insertionPos] < curElement) {
                insertionPos++;
            }
            shift(array, i-OFFSET, insertionPos);
            array[insertionPos] = curElement;
        }
    }

    private static void shift(int[] array,int from, int to) {
        for (int k = from; k >= to; k--) {
            array[k + 1] = array[k];
        }
    }

    private static int binarySearch(int[] array, int endBound, int value) {
        int startBound = FIRST_ITEM_INDEX;
        while (endBound - startBound >= HALF_DIVISOR) {
            int middle = (startBound + endBound) / HALF_DIVISOR;
            if (array[middle] > value) {
                endBound = middle;
            } else {
                startBound = middle;
            }
        }
        return startBound;
    }
}
