package com.Sam;

import java.util.ArrayList;

/**
 * Created by samagbeh on 3/1/17.
 */
public class ITECCourseManager {

    public static void main(String[] args) {

        //using the constructor
        ITECCourse android = new ITECCourse("Android", 2417, 20, "C1234");
        ITECCourse java = new ITECCourse("Java Programming", 2545, 26, "C4321");
        ITECCourse info = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");

        //using the methods
        //java.code = 2545;
        //java.name = "Java Programming";
        //java.maxStudents = 26;

        //android.code = 2417;
        //android.name = "Android";
        //android.maxStudents = 20;

        android.addStudent("alice");
        android.addStudent("bob");

        java.addStudent("Jimmy");
        java.addStudent("Barry");

        info.addStudent("Max");
        info.addStudent("Nancy");
        info.addStudent("Orson");

        ArrayList<ITECCourse> courseObjects = new ArrayList<ITECCourse>();

        courseObjects.add(0,android);
        courseObjects.add(1,java);
        courseObjects.add(2, info);

        for (int x = 0; x < courseObjects.size(); x++) {
            System.out.println("Course name: " + courseObjects.get(x).getName());
            System.out.println("Remaining spots: " + courseObjects.get(x).getSpotsLeft());
        }

    }

}
