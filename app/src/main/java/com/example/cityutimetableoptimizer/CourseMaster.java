package com.example.cityutimetableoptimizer;

class CourseMaster {

    private String courseCode;
    private boolean isSelected = false;


    public CourseMaster(String courseCode, boolean isSelected){
        this.courseCode = courseCode;
        this.isSelected = false;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
