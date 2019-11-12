package basics.linear;

import util.Input;
import util.Printer;

public class Task2 {

    private static Input input = new Input();
    private static Printer printer = new Printer();

    public static void main(String[] args) {
        printer.print("Enter a");
        double a = input.inputDouble();
        printer.print("Enter b: ");
        double b = input.inputDouble();
        printer.print("Enter c: ");
        double c = input.inputDouble();
        double z = (b + Math.sqrt(b*b + a*c*4)) / (a * 2) - a*a*a*c + Math.pow(b, -2);
        System.out.println("z = " + z);

    }
}
