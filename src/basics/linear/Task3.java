package basics.linear;

import util.Input;
import util.Printer;

public class Task3 {

    private static final Input input = new Input();
    private static final Printer printer = new Printer();

    public static void main(String[] args) {
        double x = input.inputDouble("Enter x: ");
        double y = input.inputDouble("Enter y: ");
        printer.print("Z = " + calculate(x, y));
    }

    private static double calculate(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) * Math.tan(x * y) / (Math.cos(x) - Math.sin(y));
    }
}
