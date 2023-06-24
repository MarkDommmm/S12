package TH_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Hieu",20,"CM");
        Students student2 = new Students("Long ga",30,"HN");
        Students student3 = new Students("Duyduy",27,"HT");

        Map<Integer,Students> studentMap = new HashMap<Integer,Students>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Students> student : studentMap.entrySet())  {
            System.out.println(student. toString());
        }
        System.out.println("...........Set");
        Set<Students> students = new HashSet<Students>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Students student: students) {
            System.out.println(student.toString());
        }


    }
}
