package task5;

import java.util.Objects;

public class Student {
   String name;


    public Student(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student " +
                "name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }
}
