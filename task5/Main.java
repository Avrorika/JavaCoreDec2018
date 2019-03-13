package task5;

public class Main {
    public static void main(String[] args) {

        Group<Integer> first = new Group<Integer>(Subject.LITERATURE);
        first.addToStudentList(new Student("John"), 10);
        first.addToStudentList(new Student("K"), 3);
        first.addToStudentList(new Student("Kaily"), 33);
        first.printStudentsList();

        Group<Double> second = new Group<Double>(Subject.MATHS);
        second.addToStudentList(new Student("Johnny Depp"), 10.2);
        second.addToStudentList(new Student("Kaily"), 3.1);
        second.printStudentsList();

        Group<Double> third = new Group<Double>(Subject.LOGIC);
        third.addToStudentList(new Student("Johnny Depp"), 10.2);
        third.addToStudentList(new Student("Kaily"), 10.1);

        GroupList onlyOne = new GroupList();
        onlyOne.addToGroupList(first);
        onlyOne.addToGroupList(second);
        onlyOne.addToGroupList(third);
        onlyOne.printGroupList();
        Student one = new Student("Kaily");
        onlyOne.compareStudentsMarks(onlyOne.studentGrades(one));


    }


}
