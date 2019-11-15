package basics.looping;

import util.Input;
import util.Printer;

public class Task5 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    private static final int ZERO_VALUE = 0;

    private static double e;

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of items: ");
        e = input.inputDouble("Input e: ");
        printer.print("Sum: " + findSumOfValidItems(n));
    }

    private static double findSumOfValidItems(int n) {
        double sum = ZERO_VALUE;
        double item;
        for (int i = ZERO_VALUE; i <= n; i++) {
            item = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            sum += isValidItem(item) ? item : ZERO_VALUE;
        }
        return sum;
    }

    private static boolean isValidItem(double item) {
        return Math.abs(item) >= e;
    }
}
