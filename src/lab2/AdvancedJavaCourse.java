package lab2;

/**
 ** Constructor to pass in details of course including prerequisites, and a
 * method to display the course details to the console.
 *
 * @author Josh
 * @version 1.00
 */
public class AdvancedJavaCourse extends IntroJavaCourse {

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course name: " + getCourseName()
                + "\nCourse number: " + getCourseNumber()
                + "\nCredits: " + getCredits()
                + "\nPrerquisites: " + getPrerequisites());

    }

}
