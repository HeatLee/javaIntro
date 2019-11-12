package util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFiller {

    public int[] fillArrayByInt(int size, int randomBound) {
        int[] array = new int[size];
        for (int i =0; i < size; i++) {
            array[i] = new Scanner(System.in).nextInt(randomBound);
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
