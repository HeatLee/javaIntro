package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public int inputInt() {
        int number;
        try {
                number = scanner.nextInt();
        } catch (InputMismatchException exception) {
            number = inputInt();
        }
        return number;
    }

    public double inputDouble() {
        double number;
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            number = inputInt();
        }
        return number;
    }
}


