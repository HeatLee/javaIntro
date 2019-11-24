package programming_with_classes.simple_classes_and_objects.Task2;

public class Test2 {
    private double field1;
    private double field2;

    public Test2() {
        field1 = 0;
        field2 = 1;
    }

    public Test2(double field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public double getField1() {
        return field1;
    }

    public void setField1(double field1) {
        this.field1 = field1;
    }

    public double getField2() {
        return field2;
    }

    public void setField2(double field2) {
        this.field2 = field2;
    }
}
