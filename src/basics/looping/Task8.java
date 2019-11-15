package basics.looping;

import util.ArrayFiller;
import util.Input;
import util.Printer;

public class Task8 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int DECIMAL_BASE = 10;
    private static final int ZERO_VALUE = 0;

    private static int[] buff = new int[]{};

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        do {
            firstNumber = input.inputInt("Input first positive integer: ");
            secondNumber = input.inputInt("Input second positive integer: ");
            if (firstNumber <= ZERO_VALUE || secondNumber <= ZERO_VALUE) {
                printer.print("Value should be positive. Try again...\n");
            }
        } while (firstNumber <= ZERO_VALUE || secondNumber <= ZERO_VALUE);
        printer.print("Repetitive digits: ");
        if (firstNumber >= secondNumber) {
            findRepetitiveDigits(firstNumber, secondNumber);
        } else {
            findRepetitiveDigits(secondNumber, firstNumber);
        }
        if (buff.length == 0) {
            printer.print("NONE");
        }
    }

    private static void findRepetitiveDigits(int firstNumber, int secondNumber) {
        while (firstNumber != ZERO_VALUE) {
            int firstDigit = firstNumber%DECIMAL_BASE;
            int temp = secondNumber;
            while (temp != ZERO_VALUE) {
                int secondDigit = temp % DECIMAL_BASE;
                if (secondDigit == firstDigit && !isPrinted(secondDigit)) {
                    printer.print(firstDigit + " ");
                    buff = filler.addElement(buff, secondDigit);
                }
                temp /= DECIMAL_BASE;
            }
            firstNumber /= DECIMAL_BASE;
        }
    }

    private static boolean isPrinted(int item) {
        boolean flag = false;
        for (int element : buff) {
            if (element == item) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
