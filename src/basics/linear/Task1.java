package basics.linear;

import util.Printer;
import util.Input;

public class Task1 {

    private static Input input = new Input();
    private static Printer printer = new Printer();

    public static void main(String[] args) {
        printer.print("Enter a: ");
        double a = input.inputInt();
        printer.print("Enter b: ");
        double b = input.inputInt();
        printer.print("Enter c: ");
        double c = input.inputInt();
        printer.print("Calculating z = ((a - 3) * b / 2) + c");
        double z = ((a - 3) * b / 2) + c;
        printer.print("z = " + z);
    }
}
