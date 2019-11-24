package algorithms.decomposition;

import util.Input;
import util.Printer;

public class Task9 {
    private static final int ZERO_VALUE = 0;
    private static final int WRONG_VALUE = -1;
    private static final int HALF_DIVISOR = 2;

    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double x = input.inputDouble("Input first side length: ");
        double y = input.inputDouble("Input second side length: ");
        double z = input.inputDouble("Input third side length: ");
        double t = input.inputDouble("Input fourth side length: ");
        printer.print("Square is " + findQuadrangleSquare(x, y, z, t));
    }

    private static double findQuadrangleSquare(double x, double y, double z, double t) {
        if (x > ZERO_VALUE && y > ZERO_VALUE && z > ZERO_VALUE && t > ZERO_VALUE) {
            double p = findHalfPerimeter(x, y, z, t);
            return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
        }
        return WRONG_VALUE;
    }

    private static double findHalfPerimeter(double x, double y, double z, double t) {
        if (x > ZERO_VALUE && y > ZERO_VALUE && z > ZERO_VALUE && t > ZERO_VALUE) {
            return (x + y + z + t) / HALF_DIVISOR;
        }
        return WRONG_VALUE;

    }
}
