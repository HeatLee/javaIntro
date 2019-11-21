package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task15 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int RANDOM_MAX_BOUND = 30;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows: ");
        int columns = input.inputInt("Input amount of columns: ");
        int[][] matrix = filler.fillArrayByIntRandomly(columns, rows, RANDOM_MAX_BOUND);
        printer.print("Matrix:\n");
        printer.printArray(matrix);
        int maxItem = max(matrix);
        printer.print("\nMax item in matrix: " + maxItem);
        swapAllEvenElements(matrix, maxItem);
        printer.print("\nNew matrix:\n");
        printer.printArray(matrix);
    }

    private static int max(int[][] matrix) {
        int maxItem = matrix[0][0];
        for (int[] row:matrix) {
            for (int item : row) {
                if (item > maxItem) {
                    maxItem = item;
                }
            }
        }
        return maxItem;
    }

    private static void swapAllEvenElements(int[][] matrix, int swapItem) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (isEven(matrix[i][j])) {
                    matrix[i][j] = swapItem;
                }
            }
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0 && number != 0;
    }
}
