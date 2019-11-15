package basics.looping;

import util.Input;
import util.Printer;

public class Task4 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static final int INTERVAL_LENGTH = 200;
    private static final int ZERO_VALUE = 0;
    private static final int DEFAULT_STEP = 1;

    public static void main(String[] args) {
        int startBound = input.inputInt("Input start bound ");
        int endBound = findEndBound(startBound);
        printer.print(String.format("Sum of squares from %d to %d is %d", startBound, endBound,
                findProductOfSquaresOnInterval(startBound, endBound)));
    }

    private static int findProductOfSquaresOnInterval(int from, int to) {
        int product = ZERO_VALUE;
        for (int i = from; i <= to; i+=DEFAULT_STEP) {
            product *= Math.pow(i,2);
        }
        return product;
    }

    private static int findEndBound(int startBound) {
        return startBound + INTERVAL_LENGTH;
    }
}
