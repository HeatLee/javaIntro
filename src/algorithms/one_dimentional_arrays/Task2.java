package algorithms.one_dimentional_arrays;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task2 {
    private static final Printer printer = new Printer();
    private static final Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input size of array: ");
        printer.print("Input elements of array: ");
        double[] arr = filler.fillArrayByDouble(n);
        double z = input.inputDouble("Input number for replacement: ");
        printer.print("Amount of replacements is " + replaceAllBiggerElements(arr, z) + "\n");
        printer.printArray(arr);
    }

    private static int replaceAllBiggerElements(double[] array, double z) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                counter++;
                array[i] = z;
            }
        }
        return counter;
    }
}
