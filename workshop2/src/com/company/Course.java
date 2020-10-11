package com.company;

/**
 * The Course class hold details relevant in our context
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Course {
    //the course's name
    private String name;
    //the course's code
    private String code;
    //the course's professor
    private Professor professor;
    //the course's day
    private String day;
    //the course's time
    private String time;

    /**
     *
     * @param name the course's name
     * @param code the course's code
     * @param professor the course's professor
     * @param day the course's day
     * @param time  the course's time
     */
    public Course(String name, String code, Professor professor, String day, String time){
        this.name = name;
        this.code = code;
        this.professor = professor;
        this.time = time;
        this.day = day;
    }
    /**
     * get the name of the courses
     * @return name field
     */
    public String getName(){
        return name;
    }
    /**
     * get the code of the courses
     * @return code field
     */
    public String getCode() {
        return code;
    }
    /**
     * get the professor of the courses
     * @return professor field
     */
    public Professor getProfessor() {
        return professor;
    }
    /**
     * get the time of the courses
     * @return time field
     */
    public String getTime() {
        return time;
    }
    /**
     * get the day of the courses
     * @return day field
     */
    public String getDay() {
        return day;
    }
    /**
     * print the courses name + code + professor + day + time to the out put terminal
     */
    public void printCourse(){
        System.out.println("name : " + name +"-"+ "code : " + code +"-"+ "professor : " + professor +"-"+ "day : " + day +"-"+ "time" + time );
    }
}
