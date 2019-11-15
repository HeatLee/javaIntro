package basics.looping;

import util.Printer;

public class Task6 {
    private static Printer printer = new Printer();

    private static final int START_BOUND = 0;
    private static final int END_BOUND = 256;

    public static void main(String[] args) {
        for (int i = START_BOUND; i <= END_BOUND; i++) {
            printer.print(i + " = " +(char)i + "\n");
        }
    }
}
