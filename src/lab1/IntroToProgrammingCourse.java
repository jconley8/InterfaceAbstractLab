package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    public void displayCourseDetails() {
        System.out.println("Course name: " + getCapitalizedCourseName() + 
                           "Course number: " + getCourseNumber() +
                           "Credits: " + getCredits());
    }



    
}
