package algorithms.multi_dimentional_arrays;

import util.Input;
import util.Printer;

public class Task5 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int matrixDimension = input.inputEvenInt("Input even matrix dimension: ");
        int[][] matrix = buildMatrix(matrixDimension);
        printer.print("Matrix: \n");
        printer.printArray(matrix);
    }

    private static int[][] buildMatrix(int matrixDimension) {
        int[][] tempMatrix = new int[matrixDimension][matrixDimension];
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (j + i < matrixDimension) {
                    tempMatrix[i][j] = i+1;
                } else {
                    tempMatrix[i][j] = 0;
                }
            }
        }
        return tempMatrix;
    }
}
