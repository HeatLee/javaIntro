package algorithms.decomposition;

import util.ArrayFiller;
import util.Printer;

public class Task7 {
    private static final int EVEN_DIVISOR = 2;
    private static final int ZERO_VALUE = 0;

    private static ArrayFiller filler = new ArrayFiller();
    private static Printer printer = new Printer();

    public static void main(String[] args) {
        int minBound = 1;
        int maxBound = 9;
        int[] numbers = findOddNumbers(minBound, maxBound);
        printer.print(String.format("Odd numbers between %d and %d: ", minBound, maxBound));
        printer.printArray(numbers);
        printer.print("\nSum of factorials: " + culcOddNumbersFactorialSum(numbers));
    }

    private static int[] findOddNumbers(int from, int to) {
        int[] oddNumbers = new int[]{};
        for (int i = from; i <= to; i++) {
            if (i % EVEN_DIVISOR != ZERO_VALUE) {
                oddNumbers = filler.addElement(oddNumbers, i);
            }
        }
        return oddNumbers;
    }

    private static int culcOddNumbersFactorialSum(int[] oddNumbers) {
        int sum = ZERO_VALUE;
        for (int number : oddNumbers) {
            sum += factorial(number);
        }
        return sum;
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n -1);
    }
}
