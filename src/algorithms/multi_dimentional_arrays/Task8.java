package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task8 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int RANDOM_MAX_BOUND = 10;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows in matrix: ");
        int columns = input.inputInt("Input amount of columns in matrix: ");
        double[][] matrix = filler.fillArrayByDoubleRandomly(columns, rows, RANDOM_MAX_BOUND);
        printer.print("Matrix: \n");
        printer.printArray(matrix);
        int firstColumn;
        int secondColumn;
        do {
            firstColumn = input.inputInt("Input number of first column: ");
            secondColumn = input.inputInt("Input number of second column: ");
            if (isColumnDoesntExist(matrix, firstColumn)) {
                printer.print("Number of first column doesn't exist. Try again...\n");
            }
            if (isColumnDoesntExist(matrix, secondColumn)) {
                printer.print("Number of second column doesn't exist. Try again...\n");
            }
        }while(isColumnDoesntExist(matrix, firstColumn) || isColumnDoesntExist(matrix, secondColumn));
        swapColumns(matrix, firstColumn, secondColumn);
        printer.print("Matrix after swap: \n");
        printer.printArray(matrix);
    }

    private static boolean isColumnDoesntExist(double[][] matrix, int columnNumber) {
        return columnNumber > matrix[0].length || columnNumber < 0;
    }

    private static void swapColumns(double[][] matrix, int firstColumnNumber, int secondColumnNumber) {
        for (int i = 0; i < matrix.length; i++) {
            double temp = matrix[i][firstColumnNumber-1];
            matrix[i][firstColumnNumber-1] = matrix[i][secondColumnNumber-1];
            matrix[i][secondColumnNumber-1] = temp;
        }
    }

}
