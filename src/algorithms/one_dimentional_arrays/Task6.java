package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task6 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();
    private static final int RANDOM_MAX_BOUND = 100;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of array elements: ");
        double[] array = filler.fillArrayByDoubleRandomly(n, RANDOM_MAX_BOUND);
        printer.printArray(array);
        printer.print("\nSum of elements with primary index is " + findSum(array));
    }

    private static boolean isPrimeNumber(int number) {
        int counter = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0 && i != 1) {
                counter++;
            }
        }
        return counter == 0;
    }

    private static double findSum(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(i+1)) {
                sum += array[i];
            }
        }
        return sum;
    }
}
