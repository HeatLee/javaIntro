package basics.linear;

import util.Input;
import util.Printer;

public class Task6 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        printer.print("Enter point's coordinates: \n");
        double x = input.inputDouble("Input x: ");
        double y = input.inputDouble("Input y: ");
        //printer.print("Point" + (isBelongToArea(x,y)?"is ":" isn't ") + "belongs to area.");
        printer.print("" + isBelongToArea(x,y));
    }

    private static boolean isBelongToArea(double x, double y) {
        return (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y <= 0 && y >= -3 && x != 0 && y != -1);
    }

}
