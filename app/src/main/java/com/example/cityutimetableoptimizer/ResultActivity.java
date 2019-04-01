package com.example.cityutimetableoptimizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResultActivity extends AppCompatActivity {

    Integer result_position;

    Button gen_next;
    Button gen_prev;

    TextView m_9;
    TextView t_9;
    TextView w_9;
    TextView r_9;
    TextView f_9;
    TextView s_9;

    TextView m_10;
    TextView t_10;
    TextView w_10;
    TextView r_10;
    TextView f_10;
    TextView s_10;

    TextView m_11;
    TextView t_11;
    TextView w_11;
    TextView r_11;
    TextView f_11;
    TextView s_11;

    TextView m_12;
    TextView t_12;
    TextView w_12;
    TextView r_12;
    TextView f_12;
    TextView s_12;

    TextView m_13;
    TextView t_13;
    TextView w_13;
    TextView r_13;
    TextView f_13;
    TextView s_13;

    TextView m_14;
    TextView t_14;
    TextView w_14;
    TextView r_14;
    TextView f_14;
    TextView s_14;

    TextView m_15;
    TextView t_15;
    TextView w_15;
    TextView r_15;
    TextView f_15;
    TextView s_15;

    TextView m_16;
    TextView t_16;
    TextView w_16;
    TextView r_16;
    TextView f_16;
    TextView s_16;

    TextView m_17;
    TextView t_17;
    TextView w_17;
    TextView r_17;
    TextView f_17;
    TextView s_17;

    TextView m_18;
    TextView t_18;
    TextView w_18;
    TextView r_18;
    TextView f_18;
    TextView s_18;

    TextView m_19;
    TextView t_19;
    TextView w_19;
    TextView r_19;
    TextView f_19;
    TextView s_19;

    TextView m_20;
    TextView t_20;
    TextView w_20;
    TextView r_20;
    TextView f_20;
    TextView s_20;

    TextView m_21;
    TextView t_21;
    TextView w_21;
    TextView r_21;
    TextView f_21;
    TextView s_21;

    TextView m_22;
    TextView t_22;
    TextView w_22;
    TextView r_22;
    TextView f_22;
    TextView s_22;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        m_9 = findViewById(R.id.m_9);
        t_9 = findViewById(R.id.t_9);
        w_9 = findViewById(R.id.w_9);
        r_9 = findViewById(R.id.r_9);
        f_9 = findViewById(R.id.f_9);
        s_9 = findViewById(R.id.s_9);

        m_10 = findViewById(R.id.m_10);
        t_10 = findViewById(R.id.t_10);
        w_10 = findViewById(R.id.w_10);
        r_10 = findViewById(R.id.r_10);
        f_10 = findViewById(R.id.f_10);
        s_10 = findViewById(R.id.s_10);

        m_11 = findViewById(R.id.m_11);
        t_11 = findViewById(R.id.t_11);
        w_11 = findViewById(R.id.w_11);
        r_11 = findViewById(R.id.r_11);
        f_11 = findViewById(R.id.f_11);
        s_11 = findViewById(R.id.s_11);

        m_12 = findViewById(R.id.m_12);
        t_12 = findViewById(R.id.t_12);
        w_12 = findViewById(R.id.w_12);
        r_12 = findViewById(R.id.r_12);
        f_12 = findViewById(R.id.f_12);
        s_12 = findViewById(R.id.s_12);

        m_13 = findViewById(R.id.m_13);
        t_13 = findViewById(R.id.t_13);
        w_13 = findViewById(R.id.w_13);
        r_13 = findViewById(R.id.r_13);
        f_13 = findViewById(R.id.f_13);
        s_13 = findViewById(R.id.s_13);

        m_14 = findViewById(R.id.m_14);
        t_14 = findViewById(R.id.t_14);
        w_14 = findViewById(R.id.w_14);
        r_14 = findViewById(R.id.r_14);
        f_14 = findViewById(R.id.f_14);
        s_14 = findViewById(R.id.s_14);

        m_15 = findViewById(R.id.m_15);
        t_15 = findViewById(R.id.t_15);
        w_15 = findViewById(R.id.w_15);
        r_15 = findViewById(R.id.r_15);
        f_15 = findViewById(R.id.f_15);
        s_15 = findViewById(R.id.s_15);

        m_16 = findViewById(R.id.m_16);
        t_16 = findViewById(R.id.t_16);
        w_16 = findViewById(R.id.w_16);
        r_16 = findViewById(R.id.r_16);
        f_16 = findViewById(R.id.f_16);
        s_16 = findViewById(R.id.s_16);

        m_17 = findViewById(R.id.m_17);
        t_17 = findViewById(R.id.t_17);
        w_17 = findViewById(R.id.w_17);
        r_17 = findViewById(R.id.r_17);
        f_17 = findViewById(R.id.f_17);
        s_17 = findViewById(R.id.s_17);

        m_18 = findViewById(R.id.m_18);
        t_18 = findViewById(R.id.t_18);
        w_18 = findViewById(R.id.w_18);
        r_18 = findViewById(R.id.r_18);
        f_18 = findViewById(R.id.f_18);
        s_18 = findViewById(R.id.s_18);

        m_19 = findViewById(R.id.m_19);
        t_19 = findViewById(R.id.t_19);
        w_19 = findViewById(R.id.w_19);
        r_19 = findViewById(R.id.r_19);
        f_19 = findViewById(R.id.f_19);
        s_19 = findViewById(R.id.s_19);

        m_20 = findViewById(R.id.m_20);
        t_20 = findViewById(R.id.t_20);
        w_20 = findViewById(R.id.w_20);
        r_20 = findViewById(R.id.r_20);
        f_20 = findViewById(R.id.f_20);
        s_20 = findViewById(R.id.s_20);

        m_21 = findViewById(R.id.m_21);
        t_21 = findViewById(R.id.t_21);
        w_21 = findViewById(R.id.w_21);
        r_21 = findViewById(R.id.r_21);
        f_21 = findViewById(R.id.f_21);
        s_21 = findViewById(R.id.s_21);

        m_22 = findViewById(R.id.m_22);
        t_22 = findViewById(R.id.t_22);
        w_22 = findViewById(R.id.w_22);
        r_22 = findViewById(R.id.r_22);
        f_22 = findViewById(R.id.f_22);
        s_22 = findViewById(R.id.s_22);

        Intent toResult = getIntent();
        List<String> selection_dayoff = (List<String>) toResult.getSerializableExtra("selection_dayoff");
        Log.v("Day off:", String.valueOf(selection_dayoff));

        Map<String, List<Course>> selectionAll = (Map<String, List<Course>>) toResult.getSerializableExtra("selection");
        Log.v("Map", selectionAll.keySet().toString());
        Log.v("Map size: ", String.valueOf(selectionAll.size()));

        Set<String> selectionMaster = selectionAll.keySet();

        List<String> selectionMaster_sorted = new ArrayList<>(selectionMaster);
        Collections.sort(selectionMaster_sorted);

        StringBuilder selectionMaster_s = new StringBuilder();

        selectionMaster_s.append("Course selected: ");
        for (String s : selectionMaster_sorted){
            if (!s.contains("T")) {
                selectionMaster_s.append(s + "  ");
            }
        }
        selectionMaster_s.append("\n" + "Day off: ");

        if (selection_dayoff.size() == 0){
            selectionMaster_s.append("N/A");
        }
        else {
            for (String d : selection_dayoff){
                selectionMaster_s.append(d + " ");
            }
        }

        TextView header;
        header = findViewById(R.id.selectionMaster);
        header.setText(selectionMaster_s);

        ArrayList<ArrayList<Course>> comTable = comTable(selectionAll, selectionMaster_sorted, 0);

        Log.v("All combination:", String.valueOf(comTable.size()));
        for (ArrayList<Course> com : comTable) {
            System.out.println(com);
        }

        ArrayList<ArrayList<Course>> optTable = optTable(comTable);

        Log.v("All opt:", String.valueOf(optTable.size()));
        for (ArrayList<Course> com : optTable) {
            System.out.println(com);
        }

        ArrayList<ArrayList<Course>> resultTable = getResultTable(optTable, selection_dayoff, header);

        result_position = 0;

        ArrayList<Course> timeTable = getTimeTable(resultTable, result_position);

        Map<String, List<String>> displayTable = getDisplayTable(timeTable);

        display(displayTable);

        genNext(resultTable);

        genPrev(resultTable);
    }

    public void genPrev(final ArrayList<ArrayList<Course>> resultTable){

        final ArrayList<ArrayList<Course>> mResultTable = resultTable;

        gen_prev = findViewById(R.id.generate_prev);

        result_position--;

        gen_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Course> mtimeTable = getTimeTable(mResultTable, result_position);
                Map<String, List<String>> displayTable = getDisplayTable(mtimeTable);
                display(displayTable);
                result_position--;
                if (getTimeTable(mResultTable, result_position).isEmpty()){
                    result_position = 0;
                }
            }
        });
    }

    public void genNext(final ArrayList<ArrayList<Course>> resultTable){

        final ArrayList<ArrayList<Course>> mResultTable = resultTable;

        gen_next = findViewById(R.id.generate_next);

        result_position++;

        gen_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<Course> mtimeTable = getTimeTable(mResultTable, result_position);
                Map<String, List<String>> displayTable = getDisplayTable(mtimeTable);
                display(displayTable);
                result_position++;
                if (getTimeTable(mResultTable, result_position).isEmpty()){
                    result_position = 0;
                }
            }
        });
    }

    public void display(Map<String, List<String>> displayTable){

        try {
            m_9.setText(displayTable.get("M").get(0));
            m_10.setText(displayTable.get("M").get(1));
            m_11.setText(displayTable.get("M").get(2));
            m_12.setText(displayTable.get("M").get(3));
            m_13.setText(displayTable.get("M").get(4));
            m_14.setText(displayTable.get("M").get(5));
            m_15.setText(displayTable.get("M").get(6));
            m_16.setText(displayTable.get("M").get(7));
            m_17.setText(displayTable.get("M").get(8));
            m_18.setText(displayTable.get("M").get(9));
            m_19.setText(displayTable.get("M").get(10));
            m_20.setText(displayTable.get("M").get(11));
            m_21.setText(displayTable.get("M").get(12));
            m_22.setText(displayTable.get("M").get(13));

            t_9.setText(displayTable.get("T").get(0));
            t_10.setText(displayTable.get("T").get(1));
            t_11.setText(displayTable.get("T").get(2));
            t_12.setText(displayTable.get("T").get(3));
            t_13.setText(displayTable.get("T").get(4));
            t_14.setText(displayTable.get("T").get(5));
            t_15.setText(displayTable.get("T").get(6));
            t_16.setText(displayTable.get("T").get(7));
            t_17.setText(displayTable.get("T").get(8));
            t_18.setText(displayTable.get("T").get(9));
            t_19.setText(displayTable.get("T").get(10));
            t_20.setText(displayTable.get("T").get(11));
            t_21.setText(displayTable.get("T").get(12));
            t_22.setText(displayTable.get("T").get(13));

            w_9.setText(displayTable.get("W").get(0));
            w_10.setText(displayTable.get("W").get(1));
            w_11.setText(displayTable.get("W").get(2));
            w_12.setText(displayTable.get("W").get(3));
            w_13.setText(displayTable.get("W").get(4));
            w_14.setText(displayTable.get("W").get(5));
            w_15.setText(displayTable.get("W").get(6));
            w_16.setText(displayTable.get("W").get(7));
            w_17.setText(displayTable.get("W").get(8));
            w_18.setText(displayTable.get("W").get(9));
            w_19.setText(displayTable.get("W").get(10));
            w_20.setText(displayTable.get("W").get(11));
            w_21.setText(displayTable.get("W").get(12));
            w_22.setText(displayTable.get("W").get(13));

            r_9.setText(displayTable.get("R").get(0));
            r_10.setText(displayTable.get("R").get(1));
            r_11.setText(displayTable.get("R").get(2));
            r_12.setText(displayTable.get("R").get(3));
            r_13.setText(displayTable.get("R").get(4));
            r_14.setText(displayTable.get("R").get(5));
            r_15.setText(displayTable.get("R").get(6));
            r_16.setText(displayTable.get("R").get(7));
            r_17.setText(displayTable.get("R").get(8));
            r_18.setText(displayTable.get("R").get(9));
            r_19.setText(displayTable.get("R").get(10));
            r_20.setText(displayTable.get("R").get(11));
            r_21.setText(displayTable.get("R").get(12));
            r_22.setText(displayTable.get("R").get(13));

            f_9.setText(displayTable.get("F").get(0));
            f_10.setText(displayTable.get("F").get(1));
            f_11.setText(displayTable.get("F").get(2));
            f_12.setText(displayTable.get("F").get(3));
            f_13.setText(displayTable.get("F").get(4));
            f_14.setText(displayTable.get("F").get(5));
            f_15.setText(displayTable.get("F").get(6));
            f_16.setText(displayTable.get("F").get(7));
            f_17.setText(displayTable.get("F").get(8));
            f_18.setText(displayTable.get("F").get(9));
            f_19.setText(displayTable.get("F").get(10));
            f_20.setText(displayTable.get("F").get(11));
            f_21.setText(displayTable.get("F").get(12));
            f_22.setText(displayTable.get("F").get(13));

            s_9.setText(displayTable.get("S").get(0));
            s_10.setText(displayTable.get("S").get(1));
            s_11.setText(displayTable.get("S").get(2));
            s_12.setText(displayTable.get("S").get(3));
            s_13.setText(displayTable.get("S").get(4));
            s_14.setText(displayTable.get("S").get(5));
            s_15.setText(displayTable.get("S").get(6));
            s_16.setText(displayTable.get("S").get(7));
            s_17.setText(displayTable.get("S").get(8));
            s_18.setText(displayTable.get("S").get(9));
            s_19.setText(displayTable.get("S").get(10));
            s_20.setText(displayTable.get("S").get(11));
            s_21.setText(displayTable.get("S").get(12));
            s_22.setText(displayTable.get("S").get(13));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, List<String>> getDisplayTable(ArrayList<Course> timeTable){

        Map<String, List<String>> displayTable = new HashMap<>();

        displayTable.put("M", new ArrayList<String>());
        displayTable.put("T", new ArrayList<String>());
        displayTable.put("W", new ArrayList<String>());
        displayTable.put("R", new ArrayList<String>());
        displayTable.put("F", new ArrayList<String>());
        displayTable.put("S", new ArrayList<String>());

        ArrayList<String> m = new ArrayList<>();
        ArrayList<String> t = new ArrayList<>();
        ArrayList<String> w = new ArrayList<>();
        ArrayList<String> r = new ArrayList<>();
        ArrayList<String> f = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();

        for (int i = 0 ; i < 14; i++){
            m.add("");
            t.add("");
            w.add("");
            r.add("");
            f.add("");
            s.add("");
        }

        for (Course c : timeTable){
            if (c.getDay().equals("M")){
                for (Integer time : c.getTimeFrame()){
                    m.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
            if (c.getDay().equals("T")){
                for (Integer time : c.getTimeFrame()){
                    t.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
            if (c.getDay().equals("W")){
                for (Integer time : c.getTimeFrame()){
                    w.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
            if (c.getDay().equals("R")){
                for (Integer time : c.getTimeFrame()){
                    r.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
            if (c.getDay().equals("F")){
                for (Integer time : c.getTimeFrame()){
                    f.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
            if (c.getDay().equals("S")){
                for (Integer time : c.getTimeFrame()){
                    s.add((time-9),c.getCourseCode() + "\n" + c.getSection());
                }
            }
        }

        Log.v("M", String.valueOf(m));
        Log.v("T", String.valueOf(t));
        Log.v("W", String.valueOf(w));
        Log.v("R", String.valueOf(r));
        Log.v("F", String.valueOf(f));
        Log.v("S", String.valueOf(s));

        displayTable.put("M",m);
        displayTable.put("T",t);
        displayTable.put("W",w);
        displayTable.put("R",r);
        displayTable.put("F",f);
        displayTable.put("S",s);

        for (String key : displayTable.keySet()) {
            System.out.println(key + ": " + displayTable.get(key));
        }
        return displayTable;
    }

    public ArrayList<ArrayList<Course>> getResultTable (ArrayList<ArrayList<Course>> optTable, List<String> selection_dayoff, TextView selectionMaster_t) {

        ArrayList<ArrayList<Course>> resultTable = new ArrayList<ArrayList<Course>>();

        if (!checkResult(optTable)) {
            selectionMaster_t.append("\n" + "There is no optimal timetable for your selection");
        }
        else {
            if (selection_dayoff.size() != 0) {
                ArrayList<ArrayList<Course>> filterTable = filterTable(optTable, selection_dayoff);
                Log.v("All filter:", String.valueOf(filterTable.size()));
                for (ArrayList<Course> comt : filterTable) {
                    System.out.println(comt);
                }
                if(checkResult(filterTable)){
                    resultTable = filterTable;
                }
                else{
                    selectionMaster_t.append("\n" + "There is no optimal timetable for your selection");
                }
            }
            else{
                resultTable = optTable;
            }
        }
        return resultTable;
    }

    public ArrayList<Course> getTimeTable (ArrayList<ArrayList<Course>> resultTable, Integer position) {
        ArrayList<Course> timeTable = new ArrayList<>();

        if (position < resultTable.size() && position >= 0) {
            ArrayList<Course> randTable = resultTable.get(position);

            for (Course c : randTable) {
                timeTable.add(c);
                Log.v("Time table add: ", c.getDay() + "_" + c.getStartTime() + "_" + c.toString());
            }

            return timeTable;
        }
        else if (position >= resultTable.size()){
            Toast.makeText(getApplicationContext(), "All results shown",
                    Toast.LENGTH_LONG).show();
        }
        else if (position < 0){
            Toast.makeText(getApplicationContext(), "Please press NEXT for result",
                    Toast.LENGTH_LONG).show();
        }
        return timeTable;
    }

    public Boolean checkResult(ArrayList<ArrayList<Course>> resultTable){
        //return true if the result table (optTable / filterTable) has result

        if (resultTable.size() != 0){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<ArrayList<Course>> filterTable (ArrayList<ArrayList<Course>> optTable, List<String> selection_dayoff){
        ArrayList<ArrayList<Course>> filterTable = new ArrayList<ArrayList<Course>>();
        boolean opt = false;

        ComLoop:
        for (ArrayList<Course> com : optTable) {
            CLoop:
            for (Course c : com){
                for (String d : selection_dayoff) {
                    if (c.getDay().equals(d)){
                        opt = false;
                        break CLoop;
                    }
                    else {
                        opt = true;
                    }
                }
            }
            if (opt == true) {
                filterTable.add(com);
            }
        }
        return filterTable;
    }

    public ArrayList<ArrayList<Course>> comTable (Map<String, List<Course>> selectionAll,
                                                  List<String> selectionMaster_sorted, int i) {

        if (i == selectionAll.size()) {
            ArrayList<ArrayList<Course>> comTable = new ArrayList<ArrayList<Course>>();
            comTable.add(new ArrayList<Course>());
            return comTable;
        }

        ArrayList<ArrayList<Course>> comTable = new ArrayList<ArrayList<Course>>();
        ArrayList<ArrayList<Course>> recursive = comTable(selectionAll, selectionMaster_sorted, i + 1);

        for (int j = 0; j < selectionAll.get(selectionMaster_sorted.get(i)).size(); j++) {

            for (int k = 0; k < recursive.size(); k++) {

                ArrayList<Course> newList = new ArrayList<Course>();

                for (Course course : recursive.get(k)) {
                    newList.add(course);
                }

                newList.add(selectionAll.get(selectionMaster_sorted.get(i)).get(j));

                comTable.add(newList);
            }
        }

        return comTable;
    }

    public ArrayList<ArrayList<Course>> optTable(ArrayList<ArrayList<Course>> comTable) {

        ArrayList<ArrayList<Course>> optTable = new ArrayList<ArrayList<Course>>();

        if (comTable.size() == 1){
            for (ArrayList<Course> s : comTable) {
                {
                    optTable.add(s);
                }
            }
        } else {
            for (ArrayList<Course> s : comTable) {
                if (check(s) == true)
                {
                    optTable.add(s);
                }
            }
        }

        System.out.println();
        System.out.println("Possible combinations:");
        System.out.println("------------------------------------------------------------");
        System.out.println("Total combination: " + optTable.size());

        for (ArrayList<Course> r : optTable) {
            System.out.println(r);
        }

        return optTable;

    }


    public boolean check(ArrayList<Course> subTable) {

        boolean opt = false;

        for (Course c1 : subTable) {
            for (Course c2 : subTable) {
                if (c1 != c2) {
                    if (c2.getDay().equals(c1.getDay())) {
                        if ((c2.getStartTime() < c1.getStartTime() && c2.getEndTime() < c1.getStartTime()) ||
                                c2.getStartTime() > c1.getEndTime())
                        {
                            opt = true;
                        }
                        else {
                            opt = false;
                        }
                    }
                    else {
                        opt = true;
                    }
                    if (opt == false)
                    {
                        return opt;
                    }
                }
            }
            if (opt == false)
            {
                return opt;
            }
        }
        return opt;

    }

}

