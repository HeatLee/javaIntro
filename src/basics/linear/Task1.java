package basics.linear;

import util.Printer;
import util.Input;

public class Task1 {

    private static final Input input = new Input();
    private static final Printer printer = new Printer();

    public static void main(String[] args) {
        double a = input.inputInt("Enter a: ");
        double b = input.inputInt("Enter b: ");
        double c = input.inputInt("Enter c: ");
        printer.print("Calculating z = ((a - 3) * b / 2) + c = ");
        printer.print("" + calculate(a, b, c));
    }

    private static double calculate(double a, double b, double c) {
        return  ((a - 3) * b / 2) + c;
    }
}
