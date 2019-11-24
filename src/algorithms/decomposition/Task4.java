package algorithms.decomposition;

import util.ArrayFiller;
import util.Input;
import util.Printer;

import java.util.function.DoubleBinaryOperator;

public class Task4 {
    private static final int RANDOM_MIN_BOUND = -10;
    private static final int RANDOM_MAX_BOUND = 10;
    private static final int WRONG_VALUE = -1;
    private static final int X = 0;
    private static final int Y = 1;
    private static final int SQUARE_POW = 2;
    private static final int FIRST_ITEM_INDEX = 0;
    private static final int OFFSET = 1;

    private static Printer printer = new Printer();
    private static Input input = new Input();
    private static ArrayFiller filler = new ArrayFiller();

    public static void main(String[] args) {
        int n = input.inputInt("Input amount of points: ");
        double[][] points = filler.fillArrayByDoubleRandomly(n, 2, new int[]{RANDOM_MIN_BOUND, RANDOM_MAX_BOUND});
        double[] answer = findMaxDistance(points);
        printer.print("Points:\n");
        printer.printArray(points);
        printer.print(String.format("\nMax distance is between point [%.2f,%.2f] and [%.2f,%.2f] = %f",
                getPoint(points, (int)answer[1])[X], getPoint(points, (int)answer[1])[Y],
                getPoint(points, (int)answer[2])[X], getPoint(points, (int)answer[2])[Y],
                answer[0]));
    }

    private static double[] findMaxDistance(double[][] points) {
        double maxDistance = 0;
        int pointID1 = FIRST_ITEM_INDEX;
        int pointID2 = FIRST_ITEM_INDEX;
        for (int i = FIRST_ITEM_INDEX; i < points.length; i++) {
            for (int j = i + OFFSET; j < points.length; j++) {
                double distance = findDistance(getPoint(points, i), getPoint(points, j));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    pointID1 = i;
                    pointID2 = j;
                }
            }
        }
        return new double[]{maxDistance, pointID1, pointID2};
    }

    private static double findDistance(double[] firstPoint, double[] secondPoint) {
        if (firstPoint != null && secondPoint != null) {
            return Math.sqrt((Math.pow(secondPoint[X] - firstPoint[X], SQUARE_POW)
                    + Math.pow(secondPoint[Y] - firstPoint[Y], SQUARE_POW)));
        }
        return WRONG_VALUE;
    }

    private static double[] getPoint(double[][] points, int number) {
        if (points != null && number >= 0) {
            return new double[]{points[X][number], points[Y][number]};
        }
        return new double[]{};
    }
}
