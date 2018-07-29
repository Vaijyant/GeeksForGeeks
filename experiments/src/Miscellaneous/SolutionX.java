package Miscellaneous;

import java.util.ArrayList;

public class SolutionX {

    private static class Student {

        String name;
        String id;

        Student(String name, String id) {
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("James", "11CS110A");
        Student student2 = new Student("Harry", "11CS110B");

        ArrayList list = new ArrayList();

        list.add(1);
        list.add("String");
        list.add(student1);
        list.add(student2);


        for (Object obj : list) {
            if (obj instanceof Student) {
                System.out.println(((Student) obj).name);
            }
        }
    }
}
