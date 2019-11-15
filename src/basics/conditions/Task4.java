package basics.conditions;

import util.Input;
import util.Printer;

public class Task4 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        printer.print("Input dimensions of a hole: \n");
        double a = input.inputDouble("Input length: ");
        double b = input.inputDouble("Input width: ");

        printer.print("Input dimensions of a brick: \n");
        double x = input.inputDouble("Input length: ");
        double y = input.inputDouble("Input width: ");
        double z = input.inputDouble("Input thickness: ");

        if (isBreakFitHole(x, y, a, b) || isBreakFitHole(x, z, a, b) || isBreakFitHole(y, z, a, b)) {
            printer.print("Brick will pass the hole.");
        } else {
            printer.print("Brick will not pass the hole.");
        }
    }

    private static boolean isBreakFitHole(double brickLength, double brickWidth,
                                          double holeLength, double holeWidth) {
        return (brickLength <= holeLength && brickWidth <= holeWidth) ||
                (brickWidth <= holeLength && brickLength <= holeWidth);
    }
}
