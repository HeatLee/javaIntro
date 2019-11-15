package basics.looping;

import util.Input;
import util.Printer;

public class Task7 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    private static final int START_BOUND = 2;
    private static final int HALF_DIVISOR = 2;
    private static final int ZERO_VALUE = 0;

    public static void main(String[] args) {
        int n;
        int m;
        do {
            n = input.inputInt("Input first natural number: ");
            m = input.inputInt("Input second natural number: ");
            if (n <= ZERO_VALUE || m <= ZERO_VALUE) {
                printer.print("Values should be natural. Try again...\n");
            }
        } while (n <= ZERO_VALUE || m <= ZERO_VALUE);
        if (m >= n) {
            printDivisorsOfPrimeNumbersAtInterval(n, m);
        } else {
            printDivisorsOfPrimeNumbersAtInterval(m, n);
        }
    }

    private static void printDivisorsOfPrimeNumbersAtInterval(int from, int to) {
        int counter = ZERO_VALUE;
        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) {
                printer.print(i + " : ");
                printDivisorsForNumber(i);
                counter++;
            }
        }
        if (counter == 0) {
            printer.print("Interval doesn't contains natural numbers...");
        }
    }

    private static boolean isPrimeNumber(int number) {
        int divisorCount = 0;
        for (int i = START_BOUND; i <= number / HALF_DIVISOR; i++) {
            if (number % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount != 0;
    }

    private static void printDivisorsForNumber(int number) {
        for (int i = START_BOUND; i <= number / HALF_DIVISOR; i++) {
            if (number % i == 0) {
                printer.print(i + " ");
            }
        }
        printer.print("\n");
    }
}
