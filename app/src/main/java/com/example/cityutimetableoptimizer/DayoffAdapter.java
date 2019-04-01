package com.example.cityutimetableoptimizer;

import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DayoffAdapter extends RecyclerView.Adapter implements DayoffViewHolder.OnItemSelectedListener {

    private final List<Dayoff> mDayoff;

    DayoffViewHolder.OnItemSelectedListener listener;

    public DayoffAdapter(List<Dayoff> dayoff, DayoffViewHolder.OnItemSelectedListener listener) {
        mDayoff = dayoff;
        this.listener = listener;
    }

    @Override
    public DayoffViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dayoff_item, parent, false);
        return new DayoffViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        DayoffViewHolder holder = (DayoffViewHolder) viewHolder;
        Dayoff day = mDayoff.get(position);
        holder.textView.setText(day.getDayoff());

        TypedValue value = new TypedValue();
        holder.textView.getContext().getTheme().resolveAttribute(android.R.attr.listChoiceIndicatorMultiple,
                value, true);

        holder.mDay = day;
        holder.setChecked(holder.mDay.isSelected());
    }

    @Override
    public int getItemCount() {
        return mDayoff.size();
    }


    public List<String> getDayoff() {

        List<String> selection_dayoff = new ArrayList<>();
        for (Dayoff day : mDayoff) {
            if (day.isSelected()) {
                selection_dayoff.add(day.getDayoff());
            }
        }
        return selection_dayoff;
    }


    @Override
    public void onDayoffSelected(Dayoff day) {
        listener.onDayoffSelected(day);
    }
}
