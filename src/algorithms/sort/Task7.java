package algorithms.sort;

import util.ArrayFiller;
import util.Input;
import util.Printer;

import java.security.Principal;

public class Task7 {
    public static final int ZERO_INDEX = 0;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        double[] arr1 = new double[]{1, 2.6, 5, 6.3, 7.3};
        double[] arr2 = new double[]{1.7, 5.3, 7, 8.95, 34};
        printer.print("First array: ");
        printer.printArray(arr1);
        printer.print("\nSecond array: ");
        printer.printArray(arr2);
        printer.print("\nIndexes: ");
        printer.printArray(arraysMerge(arr1, arr2));

    }

    private static int[] arraysMerge(double[] firstArr, double[] secondArr) {
        if (firstArr != null && secondArr != null) {
            int[] index = new int[secondArr.length];
            int firstPoint = ZERO_INDEX;
            int secondPoint = ZERO_INDEX;
            while (firstPoint != firstArr.length && secondPoint != secondArr.length) {
                if (secondArr[secondPoint] < firstArr[firstPoint]) {
                    index[secondPoint] = secondPoint + firstPoint;
                    secondPoint++;
                } else {
                    firstPoint++;
                }
            }
            while (secondPoint != secondArr.length) {
                index[secondPoint] = secondPoint + firstPoint;
                secondPoint++;
            }
            return index;
        }
        return new int[]{};
    }
}
