package com.company;

/**
 * The Employee class hold details relevant in our context
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Employee {
    //the employee's first Name
        private String firstName;
    //the employee's last Name
        private String lastName;
    //the employee's field
        private String phoneNumber;
    //the employee's phone number
        private String field;

    /**
     *
     * @param firstName first  name of employee
     * @param lastName  last  name of employee
     * @param field field of employee
     * @param phoneNumber phonenumber of employee
     */
        public Employee(String firstName, String lastName, String field, String phoneNumber){
            this.firstName = firstName;
            this.lastName = lastName;
            this.field = field;
            this.phoneNumber = phoneNumber;
        }
    /**
     * get the first name of the employees
     * @return firstName field
     */
        public String getFirstName(){
            return firstName;
        }
    /**
     * get the phone number of the employees
     * @return phoneNumber field
     */
        public String getPhoneNumber() {
            return phoneNumber;
        }
    /**
     * get the last name of the employees
     * @return lastName field
     */
        public String getLastName() {
            return lastName;
        }
    /**
     * get the field of the employees
     * @return  field
     */
        public String getField() {
            return field;
        }
    /**
     * print the employees first name + last name + field + phone number to the out put terminal
     */
    public void printEmployee(){
        System.out.println("first name : " + firstName +"-"+ "last name : " + lastName +"-"+ "field : " + field +"-"+ "phone number : " + phoneNumber );
    }

    }
