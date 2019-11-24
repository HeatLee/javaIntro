package programming_with_classes.simple_classes_and_objects.Task1;

import util.Printer;

public class Controller {
    private static Printer printer = new Printer();

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setField2(6.8);
        test1.setField1(3.76);
        test1.printAllFields();
        printer.print("\nMax field: " + test1.findMaxField());
        printer.print("\nSum of fields: " + test1.calcSumOfFields());
    }
}
