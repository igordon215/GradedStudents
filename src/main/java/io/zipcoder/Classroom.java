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

    public String getStudents() {
        String studentList = "Students: \n";
        for(int i  = 0; i < students.length; i++) {
            if(students[i] != null) {
                studentList += String.format("\t%s %s\n", students[i].getFirstName(), students[i].getLastName());
            }
        }
        return studentList;
    }

    public int numberOfStudents() {
        return students.length;
    }

    public double getAverageExamScore() {
        double totalAvgScore = 0;
        double avgAvgScore = 0;

        for(int i = 0; i < students.length; i++) {
            totalAvgScore += students[i].getAverageExamScore();
        }

        avgAvgScore = totalAvgScore/students.length;

        return  avgAvgScore;
    }


}
