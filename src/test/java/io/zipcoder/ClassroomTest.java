package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void testClassroomConstructor() {
        // : Given
        Classroom nullClass = new Classroom();

        // : When
        int expected = 30;
        int actual = nullClass.numberOfStudents();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClassroomConstructorWithMaxStudents() {
        // : Given
        Classroom maxClass = new Classroom(69);

        // : When
        int expected = 69;
        int actual = maxClass.numberOfStudents();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClassroomConstructorWithStudentsArray() {
        // : Given
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Double[] examScores2 = {75.0, 58.0, 84.0, 96.0, 98.0};
        Double[] examScores3 = {55.0, 65.0, 75.0, 85.0, 95.0};
        Student student1 = new Student("student","one", examScores);
        Student student2 = new Student("student","two", examScores2);
        Student student3 = new Student("student","three", examScores3);
        Student[] zipCode = {student1, student2, student3};

        Classroom codeClass = new Classroom(zipCode);

        // : When
        int expected = 3;
        int actual = codeClass.numberOfStudents();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetStudents() {
        // : Given
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Double[] examScores2 = {75.0, 58.0, 84.0, 96.0, 98.0};
        Double[] examScores3 = {55.0, 65.0, 75.0, 85.0, 95.0};
        Student student1 = new Student("student","one", examScores);
        Student student2 = new Student("student","two", examScores2);
        Student student3 = new Student("student","three", examScores3);
        Student[] zipCode = {student1, student2, student3};

        Classroom codeClass = new Classroom(zipCode);

        // : When
        String expected = String.format("Students: \n" +
                "\tstudent one\n" +
                "\tstudent two\n" +
                "\tstudent three\n");
        String actual = codeClass.getStudents();
        System.out.println(expected);
        System.out.println(actual);

        // : Then
        Assert.assertEquals(expected, actual);
    }

}
