package algorithms.decomposition;

import util.Input;
import util.Printer;

public class Task3 {
    private static final int HEXAGON_SIDES_AMOUNT = 6;

    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double side = input.inputDouble("Input triangle side: ");
        printer.print("Hexagon square: " + findHexagonSquare(side));
    }

    private static double findHexagonSquare(double side) {
        return HEXAGON_SIDES_AMOUNT * findTriangleSquare(side);
    }

    private static double findTriangleSquare(double side) {
        return Math.pow(side/2, 2) * Math.sqrt(3);
    }
}
