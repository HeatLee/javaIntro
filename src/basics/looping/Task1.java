package basics.looping;

import util.Input;
import util.Printer;

public class Task1 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static final int ZERO_VALUE = 0;

    private static final int START_BOUND = 1;

    public static void main(String[] args) {
        int number;
        do {
            number = input.inputInt("Input positive integer number: ");
            if (number <= ZERO_VALUE) {
                printer.print("Number should be positive. Try again...\n");
            }
        } while (number <= ZERO_VALUE);
        printer.print("Sum: " + findSum(number));
    }

    private static int findSum(int endBound) {
        int sum = 0;
        for (int i = START_BOUND; i < endBound; i++) {
            sum += i;
        }
        return sum;
    }
}