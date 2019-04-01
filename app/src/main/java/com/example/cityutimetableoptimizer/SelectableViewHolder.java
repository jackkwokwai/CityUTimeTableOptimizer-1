package com.example.cityutimetableoptimizer;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SelectableViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    CourseMaster mCourse;
    OnItemSelectedListener itemSelectedListener;


    public SelectableViewHolder(View view, OnItemSelectedListener listener) {
        super(view);
        itemSelectedListener = listener;
        textView = (TextView) view.findViewById(R.id.text_item);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mCourse.isSelected()) {
                    setChecked(false);
                } else {
                    setChecked(true);
                }
                itemSelectedListener.onItemSelected(mCourse);

            }
        });
    }

    public void setChecked(boolean value) {
        if (value) {
            textView.setBackgroundColor(Color.LTGRAY);
        } else {
            textView.setBackgroundColor(Color.WHITE);
        }
        mCourse.setSelected(value);
    }

    public interface OnItemSelectedListener {

        void onItemSelected(CourseMaster course);
    }
}
