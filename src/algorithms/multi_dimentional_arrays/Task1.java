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
        printColumns(array);
    }

    private static void printColumns(double[][] array) {
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (array[i][0] > array[i][array[i].length - 1] && j % 2 != 0) {
                printer.printArray(array[i]);
            }
        }
    }
}
