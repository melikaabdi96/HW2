package com.company;

/**
 * The Professor class hold details relevant in our context
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Professor {
    //the professor's first Name
    private String firstName;
    //the professor's last Name
    private String lastName;
    //the professor's email
    private String email;
    //the professor's phone number
    private String phoneNumber;

    /**
     *
     * @param firstName first  name of professors
     * @param lastName  last  name of professors
     * @param email email of professors
     * @param phoneNumber phonenumber of professors
     */
    public Professor(String firstName, String lastName, String email, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    /**
     * get the first name of the professors
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * get the email of the professors
     * @return email field
     */
    public String getEmail() {
        return email;
    }
    /**
     * get the phone number of the professors
     * @return phoneNumber field
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * get the last name of the professors
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * print the professors first name + last name + email + phone number to the out put terminal
     */
    public void printProfessor(){
        System.out.println("first name : " + firstName +"-"+ "last name : " + lastName +"-"+ "email : " + email +"-"+ "phone number : " + phoneNumber );
    }
}
