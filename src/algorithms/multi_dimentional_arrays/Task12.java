package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;
import util.Sorter;

public class Task12 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static Sorter sorter = new Sorter();

    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND  = 10;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows: ");
        int columns = input.inputInt("Input amount of columns: ");
        int[][] matrix = filler.fillArrayByIntRandomly(columns, rows, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Matrix:\n");
        printer.printArray(matrix);
        sortRowsAscending(matrix);
        printer.print("Matrix with ascending sorted rows: \n");
        printer.printArray(matrix);
        sortRowsDescending(matrix);
        printer.print("Matrix with descending sorted rows: \n");
        printer.printArray(matrix);
    }

    private static void sortRowsAscending(int[][] matrix) {
        for (int[] row : matrix) {
            sorter.sortBubbleAsc(row);
        }
    }

    private static void sortRowsDescending(int[][] matrix) {
        for (int[] row : matrix) {
            sorter.sortBubbleDes(row);
        }
    }
}
