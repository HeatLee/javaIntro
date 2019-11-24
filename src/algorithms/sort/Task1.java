//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.
package algorithms.sort;

import util.ArrayFiller;
import util.Input;
import util.Printer;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    private static final int START = 0;
    private static final int RANDOM_MAX_BOUND = 10;
    private static final int RANDOM_MIN_BOUND = -10;

    public static void main(String[] args) {

        int firstSize = input.inputInt("Enter first array size: ");
        int secondSize = input.inputInt("Enter second array size: ");
        int kPosition = input.inputInt("Enter position k: ");
        int[] firstArr = filler.fillArrayByIntRandomly(firstSize, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        int[] secondArr = filler.fillArrayByIntRandomly(secondSize, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        printer.print("\nFirst array: ");
        printer.printArray(firstArr);
        printer.print("\nSecond array: ");
        printer.printArray(secondArr);
        printer.print("\nMerged array: ");
        printer.printArray(arraysMerge(firstArr,secondArr, kPosition));
    }

    private static int[] arraysMerge(int[] destArr, int[] sourceArr, int position) {
        if (destArr != null && sourceArr != null && position <= destArr.length) {
            destArr = Arrays.copyOf(destArr, destArr.length + sourceArr.length);
            for (int i = destArr.length - 1; i >= position + sourceArr.length; i--) {
                destArr[i] = destArr[i - sourceArr.length];
            }
            for (int i = START; i < sourceArr.length; i++) {
                destArr[position + i] = sourceArr[i];
            }
            return destArr;
        }
       return new int[]{};
    }
}
