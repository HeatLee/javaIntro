package algorithms.multi_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task4 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int matrixDimension = input.inputEvenInt("Input even matrix dimension: ");
        int[][] matrix = buildMatrix(matrixDimension);
        printer.print("Array: \n");
        printer.printArray(matrix);
    }

    private static int[][] buildMatrix(int matrixDimension) {
        int[][] tempMatrix = new int[matrixDimension][matrixDimension];
        for (int i = 0; i < tempMatrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0, temp = 1; j < matrixDimension; j++, temp++) {
                    tempMatrix[i][j] = temp;
                }
            } else {
                for (int j = 0, temp = matrixDimension; j < matrixDimension; j++, temp--) {
                    tempMatrix[i][j] = temp;
                }
            }
        }
        return tempMatrix;
    }
}
