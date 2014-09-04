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

    private String prerequisites;

    public IntroJavaCourse(String prerequisites, String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
        this.prerequisites = prerequisites;
    }

    public void displayCourseDetails() {
        System.out.println("Course name: " + getCapitalizedCourseName()
                + "\nCourse number: " + getCourseNumber()
                + "\nCredits: " + getCredits()
                + "\nPrerquisites: " + getPrerequisites());
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
