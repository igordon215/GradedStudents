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

}