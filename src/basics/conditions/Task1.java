package basics.conditions;

import util.Input;
import util.Printer;

public class Task1 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double firstAngle = input.inputDouble("Input first angle: ");
        double secondAngle = input.inputDouble("Input second angle: ");
        if (isAnglsBelongsToTriangle(firstAngle, secondAngle)) {
            printer.print("Angles are belongs to ");
            if (isAnglsBelongsToRightTriangle(firstAngle, secondAngle)) {
                printer.print("right triangle.");
            } else {
                printer.print("triangle, but aren't belongs to right triangle.");
            }
        } else {
            printer.print("Angles aren't belongs to any triangle.");
        }
    }

    private static boolean isAnglsBelongsToTriangle(double firstAngle, double secondAngle) {
        return (firstAngle + secondAngle) < 180;
    }

    private static boolean isAnglsBelongsToRightTriangle(double firstAngle, double secondAngle) {
        boolean flag = false;
        if (firstAngle + secondAngle == 90 || firstAngle == 90 || secondAngle == 90) {
            flag = true;
        }
        return flag;
    }
}
