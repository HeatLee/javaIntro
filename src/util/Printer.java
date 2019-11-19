package util;

public class Printer {

    public void print(String text) {
        System.out.print(text);
    }

    public void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public void printArray(double[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + " ");
        }
    }

    public void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
