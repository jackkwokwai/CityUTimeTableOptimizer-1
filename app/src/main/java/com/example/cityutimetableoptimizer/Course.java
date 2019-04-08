package com.example.cityutimetableoptimizer;

import java.util.ArrayList;

public class Course implements java.io.Serializable {

    private String courseCode;
    private String crn;
    private String section;
    private String day;
    private String time;
    private String courseName;

    public Course(String courseCode, String crn, String section, String day, String time, String courseName) {
        this.courseCode = courseCode;
        this.crn = crn;
        this.section = section;
        this.day = day;
        this.time = time;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCRN() {
        return crn;
    }

    public String getSection() {
        return section;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public int getStartTime(){
        int startTime = Integer.parseInt(getTime().split("-")[0].trim().split(":")[0]);
        return startTime;
    }

    public int getEndTime(){
        int endTime = Integer.parseInt(getTime().split("-")[1].trim().split(":")[0]);
        return endTime;
    }

    public ArrayList<Integer> getTimeFrame(){
        ArrayList<Integer> timeFrame = new ArrayList<>();

        for (int i = getStartTime(); i <= getEndTime(); i++){
            timeFrame.add(i);
        }

        return timeFrame;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString() {
        return courseCode + " " + crn + " " + section + " " + day + " " + time;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;

        Course courseCompare = (Course) obj;
        if (courseCompare.getCourseCode().equals(this.getCourseCode()))
            return true;

        return false;

    }


}
