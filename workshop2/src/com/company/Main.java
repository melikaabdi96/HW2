package com.company;

/**
 * The Main Class help us receiving the resuts and inputing
 *
 * @author Melika Abdi
 * @version 0.0
 * @since 2020
 */
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("9723510", "Melika", "Abdi");
        Student student = new Student("9623513","aylin","kasalaei");

        student1.printStudent();

        Professor professor1 = new Professor("Abdolali", "Abdipour", "abdipour@aut.ac.ir", "64543338");
        Professor professor2 = new Professor("Mohammad javad", "Emadi", "mg.emadi@aut.ac.ir", "64543375");

        professor1.printProfessor();

        Employee employee = new Employee("Mona", "Mashhadi", "Education Office Expert","65543305");

        employee.printEmployee();

        Course course1 = new Course("Communication Circuits", "2306103", professor1, "Sunday & Tuesday", "9:15 - 10:45");
        Course course2 = new Course("Digtal communication", "2306133",  professor2, "Monday & Saturday", "9:15 - 10:45");

        course1.printCourse();

        Faculty faculty = new Faculty("Electrical Engineering", 900, 2);

        faculty.addStudent(student1);
        faculty.addCourse(course1);

        //...



	// write your code here
    }
}
