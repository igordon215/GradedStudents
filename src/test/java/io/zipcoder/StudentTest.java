package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetFirstName() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        String expected = "Bill";
        String actual = bill.getFirstName();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastName() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        String expected = "Nye";
        String actual = bill.getLastName();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFirstName() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        bill.setFirstName("Bill");
        String expected = "Bill";
        String actual = bill.getFirstName();


        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        bill.setLastName("Nye");
        String expected = "Nye";
        String actual = bill.getLastName();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfExamsTaken() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        int expected = 5;
        int actual = bill.getNumberOfExamsTaken();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetExamsScores() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        String expected = "Exam Scores:\n" +
                "\tExam 1 -> 100.0\n" +
                "\tExam 2 -> 100.0\n" +
                "\tExam 3 -> 90.0\n" +
                "\tExam 4 -> 100.0\n" +
                "\tExam 5 -> 93.0\n";
        String actual = bill.getExamScores();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddExamScores() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        bill.addExamScores(100.0);
        bill.addExamScores(98.0);
        bill.addExamScores(100.0);
        int expected = 8;
        int actual = bill.getNumberOfExamsTaken();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        bill.setExamScores(1, 90.0);
        double expected = 90;
        double actual = bill.getExamScore(1);

        // : Then
        Assert.assertEquals(expected, actual, 1e-16);
    }

    @Test
    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Bill";
        String lastName = "Nye";
        Double[] examScores = {100.0, 100.0, 90.0, 100.0, 93.0};
        Student bill = new Student(firstName, lastName, examScores);

        // : When
        double expected = 96.6;
        double actual = bill.getAverageExamScore();

        // : Then
        Assert.assertEquals(expected, actual, 1e-16);
    }

}