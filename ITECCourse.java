package com.Sam;

import java.util.ArrayList;

/**
 * Created by samagbeh on 3/1/17.
 */
public class ITECCourse {

    //Data that an ITECCourse object needs to store
    private String name;
    private int code;
    private ArrayList<String> students;
    private String room;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() { return room; }

    public void setRoom(String room) { this.room = room; }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    private int maxStudents;



    //Constructor
    ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoom) {

        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>(); //Set up the students list
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
    }

    public void addStudent (String studentName) {

        if (students == null) {
            students = new ArrayList<String>();
        }

        students.add(studentName);
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was removed.");
        } else {
            System.out.println("Student not enrolled in the class");
        }

        students.remove(studentName);
    }

    public void writeCourseInfo() {

        System.out.println("Course name: " + name);
        System.out.println("Course code: " + code);
        System.out.println("Students enrolled: " + students);
        System.out.println("Course room number: " + room);
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);

    }

    public int getNumberOfStudents() {

        return this.students.size();
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getSpotsLeft() {
        int spotsLeft = maxStudents - this.students.size();
        return spotsLeft;
    }
}
