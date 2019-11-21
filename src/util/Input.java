package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    private final Printer printer = new Printer();

    private final String ERROR_MSG = "Incorrect input type. Try again...\n";
    private final String NOT_EVEN_MSG = "Number is not even. Try again: ";
    private final int EVEN_DIVISOR = 2;
    private final int ZERO_VALUE = 0;

    public int inputEvenInt(String comment) {
        int number;
        printer.print(comment);
        try {
            do{
                number = scanner.nextInt();
                if (isNotEven(number)) {
                    printer.print(NOT_EVEN_MSG);
                }
            }while(isNotEven(number));
        } catch (InputMismatchException exception) {
            printer.print(ERROR_MSG);
            scanner.next();
            return inputInt(comment);
        }
        return number;
    }

    private boolean isNotEven(int number) {
        return number % EVEN_DIVISOR != ZERO_VALUE;
    }

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


