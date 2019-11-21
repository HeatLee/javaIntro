package algorithms.multi_dimentional_arrays;

import util.Input;
import util.Printer;

import java.util.Random;

public class Task14 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int rows;
        int columns;
        do {
            rows = input.inputInt("Input amount of rows: ");
            columns = input.inputInt("Input amount of columns: ");
            if (rows < columns) {
                printer.print("Amount rows should be >= amount of columns...\n");
            }
        } while (rows < columns);
        int[][] matrix = buildMatrix(rows, columns);
        printer.print("Matrix:\n");
        printer.printArray(matrix);
    }

    private static int[][] buildMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < columns; i++) {
            for (int j = i; j >= 0;) {
                int position = new Random().nextInt(rows);
                if (matrix[position][i] == 0) {
                    matrix[position][i] = 1;
                    j--;
                }
            }
        }
        return matrix;
    }
}
