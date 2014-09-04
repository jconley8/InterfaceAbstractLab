package lab1;

/**
 * Constructor to pass in details of course, and a method to display the course details
 * to the console.
 *
 * @author Josh Conley
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    public void displayCourseDetails() {
        System.out.println("Course name: " + getCapitalizedCourseName()
                + "\nCourse number: " + getCourseNumber()
                + "\nCredits: " + getCredits());
    }
}
