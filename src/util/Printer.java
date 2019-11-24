package util;

public class Printer {

    public void print(String text) {
        System.out.print(text);
    }

    public void printFraction(int numerator, int denominator) {
        System.out.print(String.format("%d/%d  ", numerator, denominator));
    }

    public void printFractions(int[] numerators, int[] denominators) {
        for (int i = 0; i < numerators.length; i++) {
            printFraction(numerators[i], denominators[i]);
        }
    }

    public void printFractions(int[] numerators, int commonDenominator) {
        for (int i = 0; i < numerators.length; i++) {
            printFraction(numerators[i], commonDenominator);
        }
    }

    public void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public void printArray(double[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.print(String.format("%8.2f ", array[i]));
        }
    }

    public void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%8.2f ", array[i][j]));
            }
            System.out.print("\n");
        }
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%4d", array[i][j]));
            }
            System.out.print("\n");
        }
    }
}
