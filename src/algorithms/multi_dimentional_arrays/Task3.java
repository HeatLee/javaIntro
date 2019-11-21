package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task3 {
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
        int printedRow;
        int printedColumn;
        do {
            printedRow = input.inputInt("Input row number for printing: ");
            if (printedRow >= matrix.length) {
                printer.print(String.format("There is no such row. Input number between %d and %d\n",
                        0, matrix.length-1));
            }
        } while(printedRow >= matrix.length);
        do {
            printedColumn = input.inputInt("Input column number for printing: ");
            if (printedColumn >= matrix[0].length) {
                printer.print(String.format("There is no such column. Input number between %d and %d\n",
                        0, matrix[0].length-1));
            }
        } while(printedColumn >= matrix[0].length);
        printer.print("\nRow №" + printedRow + " : ");
        printRowByNumber(matrix, printedRow);
        printer.print("\nColumn №" + printedColumn + "\n");
        printColumnByNumber(matrix, printedColumn);
    }

    private static void printColumnByNumber(double[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            printer.print(matrix[i][column] + "\n");
        }
        printer.print("\n");
    }

    private static void printRowByNumber(double[][] matrix, int row){
        printer.printArray(matrix[row]);
        printer.print("\n");
    }
}
