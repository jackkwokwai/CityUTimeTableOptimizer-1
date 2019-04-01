package com.example.cityutimetableoptimizer;

public class Dayoff {

    private String day;
    private boolean isSelected = false;


    public Dayoff(String day, boolean isSelected){
        this.day = day;
        this.isSelected = false;
    }

    public String getDayoff() {
        return day;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
