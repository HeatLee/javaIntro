package programming_with_classes.simple_classes_and_objects.Task3.container;

import programming_with_classes.simple_classes_and_objects.Task3.model.entity.Student;
import java.util.Arrays;

public class Group {
    private int size;
    private Student[] group;

    public Group() {
        group = new Student[]{};
        size = 0;
    }

    public Group(Student[] group) {
        this.group = new Student[group.length];
        size = group.length;
        System.arraycopy(group, 0, this.group, 0, group.length);
    }

    public Student[] toArray() {
        return group;
    }

    public void append(Student student) {
        if (student != null) {
            group = Arrays.copyOf(group, group.length + 1);
        }
    }

    public void appendAll(Student[] subGroup) {
        if (subGroup != null) {
            group = Arrays.copyOf(group, group.length + subGroup.length);
            System.arraycopy(subGroup, 0, group, group.length - 1, subGroup.length);
        }
    }

    public void appendAt(Student student, int position) {
        group = Arrays.copyOf(group, group.length + 1);
        System.arraycopy(0);
    }
}


