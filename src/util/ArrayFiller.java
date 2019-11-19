package util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFiller {

    public int[][] fillArrayByInt(int column, int row) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            array[i] = fillArrayByInt(column);
        }
        return array;
    }

    public int[][] fillArrayByIntRandomly(int column, int row, int randomBound) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            array[i] = fillArrayByIntRandomly(column, randomBound);
        }
        return array;
    }

    public double[][] fillArrayByDouble(int column, int row) {
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            array[i] = fillArrayByDouble(column);
        }
        return array;
    }

    public double[][] fillArrayByDoubleRandomly(int column, int row, int randomBound) {
        double[][] array = new double[row][column];
        for (int i = 0; i < row; i++) {
            array[i] = fillArrayByDoubleRandomly(column, randomBound);
        }
        return array;
    }

    public int[] fillArrayByInt(int size) {
        int[] array = new int[size];
        for (int i =0; i < size; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    public int[] fillArrayByIntRandomly(int size, int randomBound) {
        int[] array = new int[size];
        for (int i =0; i < size; i++) {
            array[i] = new Random().nextInt(randomBound);
        }
        return array;
    }

    public double[] fillArrayByDouble(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Scanner(System.in).nextDouble();
        }
        return array;
    }

    public double[] fillArrayByDoubleRandomly(int size, int randomMaxBound) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = (double)Math.round((random.nextInt(randomMaxBound) + random.nextDouble()) * 100d) / 100d;
        }
        return array;
    }

    public double[] addElement(double[] array, double newElement) {
        double[] copy = Arrays.copyOf(array, array.length + 1);
        copy[copy.length - 1] = newElement;
        return copy;
    }

    public int[] addElement(int[] array, int newElement) {
        int[] copy = Arrays.copyOf(array, array.length + 1);
        copy[copy.length - 1] = newElement;
        return copy;
    }

    public double[] deleteElementByIndex(double[] array, int elementIndex) {
        double[] newArray = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != elementIndex) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public int[] deleteElementByIndex(int[] array, int elementIndex) {
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != elementIndex) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }
}
