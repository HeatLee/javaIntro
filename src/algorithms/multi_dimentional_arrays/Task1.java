package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task1 { //wrong
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int RANDOM_MAX_BOUND = 100;

    public static void main(String[] args) {
        int rows = input.inputInt("Input amount of rows: ");
        int columns = input.inputInt("Input amount of columns: ");
        double[][] array = filler.fillArrayByDoubleRandomly(columns, rows, RANDOM_MAX_BOUND);
        printer.print("Array: \n");
        printer.printArray(array);
        printer.print("Columns: \n");
        findColumns(array);
    }

    private static void findColumns(double[][] array) {
        int lastRowIndex = array.length - 1;
        for (int i = 0; i < array[0].length; i++) {
            if (i % 2 == 0 && array[0][i] > array[lastRowIndex][i]) {
                printColumnByNumber(array, i);
            }
        }
    }

    private static void printColumnByNumber(double[][] array , int column) {
        for (int i = 0; i < array.length; i++) {
            printer.print(array[i][column] + "\n");
        }
        printer.print("\n");
    }
}
