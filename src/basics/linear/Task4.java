package basics.linear;

import util.Input;
import util.Printer;

public class Task4 {

    private static final Input input = new Input();
    private static final Printer printer = new Printer();
    private static final int VALID_AMOUNT_OF_DIGITS = 3;
    private static final int SYSTEM_BASE = 10;

    public static void main(String[] args) {
        double number = input.inputDouble("Input number with 3 digits before and after float point: ");
        double replacedNumber = replace(number);
        if (number == replacedNumber) {
            printer.print("Invalid number format.");
        } else {
            printer.print("Replaced number: " + replacedNumber);
        }

    }

    private static double replace(double number) {
        double returnValue = number;
        if (isValid(number)) {
            returnValue = (int)((number - (int)number)*Math.pow(SYSTEM_BASE, VALID_AMOUNT_OF_DIGITS)) +
                    (int)(number)/Math.pow(SYSTEM_BASE, VALID_AMOUNT_OF_DIGITS);
        }
        return returnValue;
    }

    private static boolean isValid(double number) {
        boolean flag = false;
        if (getAmountOfDigits((int)number) == 3 &&
                getAmountOfDigits((int)((number - (int)number)*Math.pow(SYSTEM_BASE, VALID_AMOUNT_OF_DIGITS))) == 3) {
            flag = true;
        }
        return flag;
    }

    private static int getAmountOfDigits(int number) {
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        };
        return count;
    }
}
