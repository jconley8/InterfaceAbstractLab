package lab1;

import javax.swing.JOptionPane;

/**
 * Constructor to pass in details of course including prerequisites, and a method to display the course details
 * to the console.
 *
 * @author Josh Conley
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }

    public void displayCourseDetails() {
        System.out.println("Course name: " + getCapitalizedCourseName()
                + "\nCourse number: " + getCourseNumber()
                + "\nCredits: " + getCredits()
                + "\nPrerquisites: " + getPrerequisites());
    }

}
