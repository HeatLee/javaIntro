package basics.conditions;


import util.Input;
import util.Printer;

public class Task5 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        double x = input.inputDouble("Input x: ");
        printer.print("Function: " + solveFunc(x));
    }

    private static double solveFunc(double x) {
        double value;
        if (x <= 3) {
            value = Math.pow(x, 2) - 3 * x + 9;
        } else {
            value = 1 / (Math.pow(x, 3) + 6);
        }
        return value;
    }
}
