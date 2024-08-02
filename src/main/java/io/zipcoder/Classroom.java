package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;

public class Classroom {
    public Student[] students;
    public HashMap<Character, ArrayList<Student>> gradedStudents = new HashMap<Character, ArrayList<Student>>();

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        students = new Student[30];
    }


}
