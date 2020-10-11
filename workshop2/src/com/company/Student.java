package com.company;

/**
 * The Student class hold details relevant in our context
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Student {
    //the student's first name
    private String firstName;
    //the student's last name
    private String lastName;
    //the student's ID
    private String id;

    /**
     *
     * @param id student ID
     * @param firstName first name of students
     * @param lastName last name of students
     */
    public Student(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * get the first name of the student
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * get the ID of the student
     * @return id field
     */
    public String getId() {
        return id;
    }

    /**
     * get the last name of the student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * print the students first name + last name + ID to the out put terminal
     */
    public void printStudent(){
        System.out.println("ID : " + id + "-" + "first name : " + firstName +"-"+ "last name : " + lastName);
    }
}
