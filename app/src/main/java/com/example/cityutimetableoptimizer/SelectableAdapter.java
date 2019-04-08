package com.example.cityutimetableoptimizer;

import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SelectableAdapter extends RecyclerView.Adapter implements SelectableViewHolder.OnItemSelectedListener {

    private final List<CourseMaster> mCourseMaster;

    SelectableViewHolder.OnItemSelectedListener listener;

    public SelectableAdapter(List<CourseMaster> courseMaster, SelectableViewHolder.OnItemSelectedListener listener) {
        mCourseMaster = courseMaster;
        this.listener = listener;
    }

    @Override
    public SelectableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new SelectableViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        SelectableViewHolder holder = (SelectableViewHolder) viewHolder;
        CourseMaster course = mCourseMaster.get(position);
        String text = course.getCourseCode() + " " + course.getCourseName();
        holder.textView.setText(text);

        TypedValue value = new TypedValue();
        holder.textView.getContext().getTheme().resolveAttribute(android.R.attr.listChoiceIndicatorMultiple,
                value, true);

        holder.mCourse = course;
        holder.setChecked(holder.mCourse.isSelected());
    }

    @Override
    public int getItemCount() {
        return mCourseMaster.size();
    }


    public List<String> getSelection() {

        List<String> selection = new ArrayList<>();
        for (CourseMaster course : mCourseMaster) {
            if (course.isSelected()) {
                selection.add(course.getCourseCode());
            }
        }
        return selection;
    }


    @Override
    public void onItemSelected(CourseMaster course) {
        listener.onItemSelected(course);
    }
}
