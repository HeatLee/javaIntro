package algorithms.sort;

import util.Printer;

public class Task3 {
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int OFFSET = 1;
    private static final int HALF_DIVISOR = 2;

    private static Printer printer = new Printer();

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 17, 44, 77, 95, 99};
        printer.printArray(selectionSort(arr));
    }

    private static int[] selectionSort(int[] arr) {
        if (arr != null) {
            for (int i = FIRST_ITEM_INDEX; i < arr.length / HALF_DIVISOR; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-i-OFFSET];
                arr[arr.length-i-OFFSET] = temp;
            }
            return arr;
        }
        return new int[]{};
    }
}
