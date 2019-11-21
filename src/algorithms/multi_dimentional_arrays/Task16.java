package algorithms.multi_dimentional_arrays;

import util.Input;
import util.Printer;

public class Task16 {
    private static Printer printer = new Printer();
    private static Input input = new Input();

    public static void main(String[] args) {
        int n;
        do {
            n = input.inputInt("Input NOT EVEN dimension of magic square: ");
            if (isEven(n)) {
                printer.print("Sorry, dimension shouldn't be even...\n");
            }
            if (n < 0) {
                printer.print("Dimension should be positive...\n");
            }
            if (n == 0) {
                printer.print("0 is not natural number...\n");
            }
        } while (isEven(n) && n > 0);
        int[][] magicSquare = generateMagicSquare(n);
        printer.print("Magic square:\n");
        printer.printArray(magicSquare);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int[][] generateMagicSquare(int n) {
        int i = n/2;
        int j = n-1;
        int[][] magicSquare = new int[n][n];
        for (int number = 1; number <= n * n;) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n-1;
                }
            }
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = number++;
            }
            j++;
            i--;
        }
        return magicSquare;
    }
}
