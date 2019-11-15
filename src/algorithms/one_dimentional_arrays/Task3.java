package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task3 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input size of the array: ");
        printer.print("Input array elements: ");
        double[] array = filler.fillArrayByDouble(n);
        printer.print("\nAmount of '0' is " + findAmountOfZero(array));
        printer.print("\nAmount of negative numbers is " + findAmountOfNegative(array));
        printer.print("\nAmount of positive numbers is " + findAmountOfPositive(array));
    }

    private static int findAmountOfZero(double[] array) {
        int counter = 0;
        for (double el: array) {
            if (el == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int findAmountOfPositive(double[] array) {
        int counter = 0;
        for (double el : array) {
            if (el > 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int findAmountOfNegative(double[] array) {
        int counter = 0;
        for (double el : array) {
            if (el < 0) {
                counter++;
            }
        }
        return counter;
    }
}
