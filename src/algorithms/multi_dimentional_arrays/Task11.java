package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Printer;

public class Task11 {
    private static Printer printer = new Printer();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int AMOUNT_OF_ROWS = 10;
    private static final int AMOUNT_OF_COLUMNS = 20;
    private static final int RANDOM_MAX_BOUND = 15;

    public static void main(String[] args) {
        int[][] matrix = filler.fillArrayByIntRandomly(AMOUNT_OF_COLUMNS, AMOUNT_OF_ROWS, RANDOM_MAX_BOUND);
        printer.print("Matrix: \n");
        printer.printArray(matrix);
        printer.print("Rows numbers with amount of 5 >=3: ");
        printer.printArray(findRowsNumbers(matrix));
    }

    private static int[] findRowsNumbers(int[][] matrix) {
        int[] rowsNumbers = new int[]{};
        for (int i = 0, counter; i < matrix.length; i++) {
            counter = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) {
                    counter ++;
                }
                if (counter == 3) {
                    rowsNumbers = filler.addElement(rowsNumbers, i);
                    break;
                }
            }
        }
        return rowsNumbers;
    }
}
