/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Josh
 */
public class StartUp {

    public static void main(String[] args) {

        ProgrammingCourse course1 = new IntroToProgrammingCourse("Introduction to Programming", "205495", 3);
        ProgrammingCourse course2 = new AdvancedJavaCourse("Advanced Java Programming", "304581", 4, "Introduction to Java Programming");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
