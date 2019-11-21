package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task2 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int RANDOM_MAX_BOUND = 100;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows: ");
        int columns = input.inputInt("Input amount of columns: ");
        double[][] matrix = filler.fillArrayByDoubleRandomly(columns, rows, RANDOM_MAX_BOUND);
        printer.print("Array: \n");
        printer.printArray(matrix);
        if (isSquareMatrix(matrix)) {
            printer.print("\nMain diagonal: ");
            printMainDiagonal(matrix);
            printer.print("\nSide diagonal: ");
            printSideDiagonal(matrix);
        } else {
            printer.print("Matrix is not square...");
        }
    }

    private static boolean isSquareMatrix(double[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    private static void printMainDiagonal(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                printer.print(matrix[i][i] + " ");
        }
    }

    private static void printSideDiagonal(double[][] matrix) {
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
           printer.print(matrix[j][i] + " ");
        }
    }
}

