package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task10 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int RANDOM_MAX_BOUND = 10;
    private static final int RANDOM_MIN_BOUND = -10;

    public static void main(String[] args) {
        int n = input.inputInt("Input square matrix dimension: ");
        double[][] matrix = filler.fillArrayByDoubleRandomly(n, n, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("Matrix: \n");
        printer.printArray(matrix);
        printer.print("\nPositive items on main diagonal: ");
        printer.printArray(findPositiveItemsOnMainDiagonal(matrix));
    }

    private static double[] findPositiveItemsOnMainDiagonal(double[][] matrix) {
        double[] items = new double[]{};
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                items = filler.addElement(items, matrix[i][i]);
            }
        }
        return items;
    }
}
