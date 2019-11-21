package algorithms.multi_dimentional_arrays;

import util.Input;
import util.Printer;

public class Task7 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int n = input.inputInt("Input square matrix dimension: ");
        double[][] matrix = buildMatrix(n);
        printer.print("Matrix: \n");
        printer.printArray(matrix);
        printer.print("\nSum of positive elements: " + culcSumOfPositive(matrix));
    }

    private static double[][] buildMatrix(int matrixDimension) {
        double[][] tempMatrix = new double[matrixDimension][matrixDimension];
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                tempMatrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrixDimension);
            }
        }
        return tempMatrix;
    }

    private static double culcSumOfPositive(double[][] matrix) {
        double sum = 0;
        for (double row[] : matrix) {
            for (double element : row) {
                if (element > 0) {
                    sum += element;
                }
            }
        }
        return sum;
    }
}
