package basics.linear;

import util.Input;
import util.Printer;

public class Task2 {

    private static final Input input = new Input();
    private static final Printer printer = new Printer();

    public static void main(String[] args) {
        double a = input.inputDouble("\nEnter a: ");
        double b = input.inputDouble("\nEnter b: ");
        double c = input.inputDouble("\nEnter c: ");
        printer.print("z = " + calculate(a, b, c));
    }

    private static double calculate(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b,2) + 4*a*c)) / (a * 2) - Math.pow(a,3)*c + Math.pow(b, -2);
    }
}
