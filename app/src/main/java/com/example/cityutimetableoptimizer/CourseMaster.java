package com.example.cityutimetableoptimizer;

class CourseMaster {

    private String course;
    private String courseCode;
    private String courseName;
    private boolean isSelected = false;


    public CourseMaster(String course, boolean isSelected){
        this.course = course;
        this.isSelected = false;
    }

    public String getCourseCode() {
        courseCode = course.split("_")[0];
        return courseCode;
    }

    public String getCourseName() {
        courseName = course.split("_")[1];
        return courseName;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
