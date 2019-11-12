package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    private final Printer printer = new Printer();

    private final String ERROR_MSG = "Incorrect input type. Try again...\n";

    public int inputInt(String comment) {
        int number;
        printer.print(comment);
        try {
                number = scanner.nextInt();
        } catch (InputMismatchException exception) {
            printer.print(ERROR_MSG);
            scanner.next();
            return inputInt(comment);
        }
        return number;
    }

    public double inputDouble(String comment) {
        double number;
        printer.print(comment);
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            printer.print(ERROR_MSG);
            scanner.next();
            return inputDouble(comment);
        }
        return number;
    }
}


