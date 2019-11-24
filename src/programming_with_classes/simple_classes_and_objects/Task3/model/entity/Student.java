package programming_with_classes.simple_classes_and_objects.Task3.model.entity;

public class Student {
    private String fullName;
    private String groupNumber;
    private int[] rating;

    public Student() {
        fullName = "";
        groupNumber = "";
        rating = new int[]{};
    }

    public Student(String fullName, String groupNumber, int[] rating) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.rating = rating;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int[] getRating() {
        return rating;
    }
}
