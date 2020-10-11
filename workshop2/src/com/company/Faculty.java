package com.company;

/**
 * The Faculty class hold details relevant in our context
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Faculty {
    //the faculty's name
    private int name;
    //the faculty's students
    private Student[] students;
    //the faculty's courses
    private Course[] courses;
    //the faculty's student capacity
    private int capacity;
    //the faculty's size and number of students
    public int size;
    //the faculty's classes for courses
    private int classes;
    //the faculty's number of class(all classes that faculty has)
    private int numberOfClasses;

    /**
     *
     * @param name the faculty's name
     * @param capacity  the faculty's student capacity
     * @param numberOfClasses the faculty's number of class(all classes that faculty has)
     */
    public Faculty(String name, int capacity, int numberOfClasses){
        this.capacity = capacity;
        this.size = 0;
        this.students = new Student[capacity];
        this.numberOfClasses = numberOfClasses;
        this.classes = 0;
        this.courses = new Course[numberOfClasses];

    }

    /**
     * if there is more capacity it will add one more student to faculty
     * @param student the student that wants to add to the faculty
     */
    public void addStudent(Student student){
        if (size < capacity){
            students[size] = student;
            size++;
            System.out.println("student added");
        }else{
            System.out.println("no more capacity!!");
        }
    }
    /**
     * if there is more class it will add one more course to faculty
     * @param course the course that wants to add to the faculty
     */
    public void addCourse(Course course) {
        if (classes < numberOfClasses) {
            courses[classes] = course;
            classes++;
            System.out.println("done!");
        } else {
            System.out.println("Classes are full!");
        }
    }
    /**
     * get the students of the faculty
     * @return students field
     */
    public Student[] getStudents() {
            return students;
    }
    /**
     * get the courses of the courses
     * @return course field
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     *
     * @param student set student of the faculty
     */
    public  void setStudents(Student student){};
}


