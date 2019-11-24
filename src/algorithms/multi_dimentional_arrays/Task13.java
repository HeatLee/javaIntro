package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;
import util.BubbleSorter;

public class Task13 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static BubbleSorter bubbleSorter = new BubbleSorter();

    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND  = 10;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows: ");
        int columns = input.inputInt("Input amount of columns: ");
        int[][] matrix = filler.fillArrayByIntRandomly(columns, rows, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Matrix:\n");
        printer.printArray(matrix);
        sortColumnsAsc(matrix);
        printer.print("Sorted Asc:\n");
        printer.printArray(matrix);
        sortColumnsDes(matrix);
        printer.print("Sorted Des:\n");
        printer.printArray(matrix);
    }

    private static void sortColumnsDes(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int[] sortedColumn = getColumnByNumber(matrix, i);
            bubbleSorter.sortBubbleDes(sortedColumn);
            setColumnByNumber(matrix, sortedColumn, i);
        }
    }

    private static void sortColumnsAsc(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int[] sortedColumn = getColumnByNumber(matrix, i);
            bubbleSorter.sortBubbleAsc(sortedColumn);
            setColumnByNumber(matrix, sortedColumn, i);
        }
    }

    private static int[] getColumnByNumber(int[][] matrix, int number) {
        int[] column = new int[]{};
        for (int i = 0; i < matrix.length; i++) {
            column = filler.addElement(column, matrix[i][number]);
        }
        return column;
    }

    private static void setColumnByNumber(int[][] matrix, int[] column, int number) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][number] = column[i];
        }
    }
}
