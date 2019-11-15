package basics.conditions;

import util.Input;
import util.Printer;

public class Task2 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double a = input.inputDouble("Input a: ");
        double b = input.inputDouble("Input b: ");
        double c = input.inputDouble("Input c: ");
        double d = input.inputDouble("Input d: ");
        printer.print("max(min(a,b), min(c,d)) = " + max(min(a, b), min(c, d)));
    }

    private static double min(double a, double b) {
        return (a <= b) ? a : b;
    }

    private static double max(double a, double b) {
        return (a >= b) ? a : b;
    }
}
