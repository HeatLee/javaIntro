package basics.linear;

import util.Input;
import util.Printer;

public class Task5 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        int seconds = input.inputInt("Input amount of seconds: ");
        printer.print(String.format("%02dH %02dM %02dS",
                seconds/SECONDS_IN_HOUR, seconds%SECONDS_IN_HOUR/SECONDS_IN_MINUTE, seconds%SECONDS_IN_MINUTE));
    }


}
