package task5;

import java.util.HashMap;
import java.util.Map;

public class Group<T extends Number> {

    private Subject subject;
   Map<Student, T> studentMap;
    T studentMark;


    public Group(Subject subject) {
        this.subject = subject;
        studentMap = new HashMap<>();

    }

    void addToStudentList(Student student, T studentMark) {

        this.studentMark = studentMark;

        studentMap.put(student, studentMark);
    }

    void removeFromStudentList(Student student) {
        studentMap.remove(student);
    }

    void printStudentsList() {
        System.out.printf("Group: %s\n", subject);
        for (Map.Entry<Student, T> student : studentMap.entrySet()) {
            System.out.print(student.getKey().toString() + " ");
            System.out.println(", mark = " + student.getValue());
        }
    }

    @Override
    public String toString() {
        return "Group" +
                " subject = " + subject +
                ", studentList = " + studentMap;
    }

    public Subject getSubject() {
        return subject;
    }

    public Map<Student, T> getStudentMap() {
        return studentMap;
    }

    public T getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(T studentMark) {
        this.studentMark = studentMark;
    }

}






