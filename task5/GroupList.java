package task5;

import java.util.*;

public class GroupList{

    GroupList() {

        this.groupList = new ArrayList<>();
    }

    private List<Group> groupList;

    void addToGroupList(Group group) {
        groupList.add(group);
    }

    void printGroupList() {
        for (Group group : groupList) {
            System.out.println(group);
        }

    }

    Map<Subject, Number> studentGrades(Student student) {
        Map<Subject, Number> studentList = new HashMap<>();

        for (Group group : groupList) {
            if (group.getStudentMap().containsKey(student)) {
                studentList.put(group.getSubject(), (Number) group.getStudentMap().get(student));
            }

        }
        System.out.println(student + " " + studentList);
        return studentList;
    }

void compareStudentsMarks( Map<Subject, Number> studentList1){
    Map<Subject, Number> studentList = new HashMap<>( studentList1);
    List<Map.Entry<Subject, Number>> enteries = new LinkedList<>(studentList.entrySet());
   Collections.sort(enteries, (o1, o2) -> {
       if(o2.getValue().intValue()> o1.getValue().intValue()) {
           return 1;
       } else if(o2.getValue().intValue()< o1.getValue().intValue())
           return -1;
       else
           return 0;
   });

    Map<Subject, Number> sortedMap = new LinkedHashMap<>();
    for (Map.Entry<Subject, Number> entry : enteries) {
        sortedMap.put(entry.getKey(), entry.getValue());
    }
    System.out.println(sortedMap);
}
}


















