package basics.conditions;

import util.Input;
import util.Printer;

public class Task3 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double x1 = input.inputDouble("Input x1: ");
        double y1 = input.inputDouble("Input y1: ");

        double x2 = input.inputDouble("Input x2: ");
        double y2 = input.inputDouble("Input y2: ");

        double x3 = input.inputDouble("Input x3: ");
        double y3 = input.inputDouble("Input y3: ");

        if (isPointOnOneLine(x1, y1, x2, y2, x3, y3)) {
            printer.print("Point are on one line");
        } else {
            printer.print("Point aren't on one line");
        }

    }

    private static boolean isPointOnOneLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (x1-x3) / (x2-x3) == (y1-y3) / (y2-y3);
    }


}
