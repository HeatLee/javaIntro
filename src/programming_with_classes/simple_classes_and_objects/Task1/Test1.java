package programming_with_classes.simple_classes_and_objects.Task1;

import util.Printer;

public class Test1 {
    private double field1;
    private double field2;

    private Printer printer = new Printer();

    public void printAllFields() {
        printer.print(String.format("\nfield1 = %f \nfield2 = %f", field1, field2));
    }

    public void setField1(double field1) {
        this.field1 = field1;
    }

    public void setField2(double field2) {
        this.field2 = field2;
    }

    public double calcSumOfFields() {
        return field1 + field2;
    }

    public double findMaxField() {
        return field1 > field2 ? field1 : field2;
    }
}
