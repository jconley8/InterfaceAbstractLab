package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends IntroJavaCourse {

    public AdvancedJavaCourse(String prerequisites, String courseName, String courseNumber, double credits) {
        super(prerequisites, courseName, courseNumber, credits);
    }    

    @Override
    public void displayCourseDetails() {     
        System.out.println("Course name: " + getCapitalizedCourseName()
                + "Course number: " + getCourseNumber()
                + "Credits: " + getCredits()
                + "Prerquisites: " + getPrerequisites());
    
    }    
}
