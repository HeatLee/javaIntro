package basics.looping;

import util.Input;
import util.Printer;

public class Task2 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double a = input.inputDouble("Input start bound: ");
        double b = input.inputDouble("Input end bound: ");
        double h = input.inputDouble("Input step: ");

        printer.print("" + solveFunctionOnInterval(a, b, h));
    }

    private static double solveFunctionOnInterval(double from, double to, double step) {
        double y = 0.0d;
        for (double i = from; i <= to; i += step) {
            y += i > 2 ? i : -i;
        }
        return y;
    }
}
