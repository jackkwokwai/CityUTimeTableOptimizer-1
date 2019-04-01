package com.example.cityutimetableoptimizer;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class DayoffViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    Dayoff mDay;
    OnItemSelectedListener itemSelectedListener;


    public DayoffViewHolder(View view, OnItemSelectedListener listener) {
        super(view);
        itemSelectedListener = listener;
        textView = (TextView) view.findViewById(R.id.dayoff_item);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mDay.isSelected()) {
                    setChecked(false);
                } else {
                    setChecked(true);
                }
                itemSelectedListener.onDayoffSelected(mDay);

            }
        });
    }

    public void setChecked(boolean value) {
        if (value) {
            textView.setBackgroundColor(Color.LTGRAY);
        } else {
            textView.setBackgroundColor(Color.WHITE);
        }
        mDay.setSelected(value);
    }

    public interface OnItemSelectedListener {

        void onDayoffSelected(Dayoff day);
    }
}
