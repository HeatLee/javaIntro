package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task9 {
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
        double[] sums = calcSumOfEachColumn(matrix);
        printer.print("Sums\n");
        printer.printArray(sums);
        printer.print("\nMax sum = " + max(sums));
    }

    private static double[] calcSumOfEachColumn(double[][] matrix) {
        double[] columnsSums = new double[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            columnsSums[i] = sum;
        }
        return columnsSums;
    }

    private static double max(double[] array) {
        double maxItem = array[0];
        for (double i : array) {
            if (i > maxItem) {
                maxItem = i;
            }
        }
        return maxItem;
    }
}
