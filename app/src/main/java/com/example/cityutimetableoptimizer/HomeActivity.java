package com.example.cityutimetableoptimizer;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class HomeActivity extends AppCompatActivity implements SelectableViewHolder.OnItemSelectedListener, DayoffViewHolder.OnItemSelectedListener {

    private List<Course> courses = new ArrayList<>();
    private List<String> courseMaster_s = new ArrayList<>();
    private List<CourseMaster> courseMaster = new ArrayList<>();

    private List<Dayoff> dayOff = new ArrayList<>();

    public Button btnOpt;
    public Button btnClear;

    RecyclerView recyclerView;
    SelectableAdapter adapter;

    RecyclerView recyclerView_dayoff;
    DayoffAdapter adapter_dayoff;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FirebaseApp.initializeApp(this);

        // courses: List<Course>, read csv file
        courses = readFile();

        // courseMaster_s: List<String>, Master list of courses
        courseMaster_s = setCourseMaster(courses);
        Log.d("course master ", String.valueOf(courseMaster_s));

        // courseMaster: List<CourseMaster>, Master list of courses
        courseMaster = getCourseMaster(courseMaster_s);

        recyclerView = (RecyclerView) findViewById(R.id.selection_list);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new SelectableAdapter(courseMaster, this);
        recyclerView.setAdapter(adapter);

        dayOff = getDayoffMaster();

        recyclerView_dayoff = (RecyclerView) findViewById(R.id.dayOff_list);
        recyclerView_dayoff.setHasFixedSize(true);

        LinearLayoutManager layoutManager_dayoff = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView_dayoff.setLayoutManager(layoutManager_dayoff);

        adapter_dayoff = new DayoffAdapter(dayOff, this);
        recyclerView_dayoff.setAdapter(adapter_dayoff);
        btnInit();
    }

    public void btnInit() {
        btnOpt = (Button) findViewById(R.id.btnOpt);

        btnClear = (Button) findViewById(R.id.btnClear);

        btnOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toResult = new Intent(HomeActivity.this, ResultActivity.class);

                if (adapter.getSelection().size() == 0){
                    Toast.makeText(getApplicationContext(), "Please select at least 1 course",
                            Toast.LENGTH_LONG).show();
                }
                else if (adapter.getSelection().size() < 7){
                    Map<String, List<Course>> selectionAll = getCourses(adapter.getSelection(), courses);
                    toResult.putExtra("selection", (Serializable) selectionAll);

                    database = FirebaseDatabase.getInstance();
                    myRef = database.getReference("selection");
                    String key = myRef.push().getKey();
                    myRef.child(key).setValue(adapter.getSelection());

                    List<String> selectionAll_dayoff = getDayoff(adapter_dayoff.getDayoff());
                    toResult.putExtra("selection_dayoff", (Serializable) selectionAll_dayoff);
                    startActivity(toResult);
                }
                else if (adapter.getSelection().size() > 6){
                    Toast.makeText(getApplicationContext(), "You can select 6 courses at maximum",
                            Toast.LENGTH_LONG).show();
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                courseMaster.clear();
                courseMaster = getCourseMaster(courseMaster_s);
                adapter = new SelectableAdapter(courseMaster, HomeActivity.this);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                dayOff.clear();
                dayOff = getDayoffMaster();
                adapter_dayoff = new DayoffAdapter(dayOff, HomeActivity.this);
                recyclerView_dayoff.setAdapter(adapter_dayoff);
                adapter_dayoff.notifyDataSetChanged();
            }
        });
    }

    public List<Dayoff> getDayoffMaster(){
        List<Dayoff> dayOff = new ArrayList<>();
        dayOff.add(new Dayoff("M", false));
        dayOff.add(new Dayoff("T", false));
        dayOff.add(new Dayoff("W", false));
        dayOff.add(new Dayoff("R", false));
        dayOff.add(new Dayoff("F", false));
        dayOff.add(new Dayoff("S", false));

        return dayOff;
    }

    @Override
    public void onDayoffSelected(Dayoff day) {
        List<String> selection_dayoff = adapter_dayoff.getDayoff();

        String str = "";

        for (String c : selection_dayoff) {
            str += c + " " ;
        }

        Log.v("Dayoff selected: ", str);
    }

    public List<String> getDayoff(List<String> dayoff){
        List<String> selection_dayoff = adapter_dayoff.getDayoff();

        return selection_dayoff;
    }

    public Map<String, List<Course>> getCourses(List<String> selection, List<Course> courses) {

        Map<String, List<Course>> selectionAll = new HashMap<String, List<Course>>();

        for (Course c : courses) {
            for (String s : selection) {
                if (s.equals(c.getCourseCode())) {
                    if (c.getSection().contains("T") || c.getSection().contains("L")) {
                        List<Course> course = selectionAll.get(s + "T");

                        if (course == null) {
                            course = new ArrayList<>();
                            selectionAll.put(s + "T", course);
                            Log.v("Created Map: ", s  + "T" + " " + c.toString());
                        }
                        else {
                            course.add(c);
                            Log.v("Added to Map: ", s + "T" + " " + c.toString());
                        }

                    } else {
                        List<Course> course = selectionAll.get(s);
                        if (course == null) {
                            course = new ArrayList<>();
                            selectionAll.put(s, course);
                            Log.v("Created Map: ", s + " " + c.toString());
                        }
                        course.add(c);
                        Log.v("Added to Map: ", s + " " + c.toString());
                    }

                }
            }
        }
        return selectionAll;
    }


    @Override
    public void onItemSelected(CourseMaster course) {
        List<String> selection = adapter.getSelection();

        String str = "";

        for (String c : selection) {
            str += c + " " ;
        }

        Log.v("Course selected: ", str);
    }

    private List<String> setCourseMaster (List<Course> courses) {

        List<String> courseMaster_s = new ArrayList<>();

        for (Course c : courses) {
            if (courseMaster_s.contains(c.getCourseCode())) {
                Log.v("Course added already ", c.getCourseCode());
            } else {
                courseMaster_s.add(c.getCourseCode());
                Log.v("Add course ", c.getCourseCode());
            }
        }
        return courseMaster_s;
    }

    private List<CourseMaster> getCourseMaster(List<String> CourseMaster_s) {

        List<CourseMaster> courseMaster = new ArrayList<>();

        for (String c : CourseMaster_s) {
            if (!(courseMaster.contains(c))){
                CourseMaster course = new CourseMaster(c, false);
                courseMaster.add(course);
            }
        }
        return courseMaster;
    }

    private List<Course> readFile() {

        List<Course> courses = new ArrayList<>();

        InputStream is = getResources().openRawResource(R.raw.data);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";

        try {
            //Skip the header
            reader.readLine();

            while ( (line = reader.readLine()) != null) {
                //Split by ","
                String[] attributes = line.split(",");

                //Read the data
                Course course = createCourse(attributes);
                courses.add(course);

                Log.v("MyActivity", "Just created: " + course);
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line " + line, e);
            e.printStackTrace();
        }

        return courses;
    }

    private static Course createCourse(String[] attributes) {
        // Return Course: object for single crn
        // with courseCode, crn, section, day, time

        String courseCode = attributes[0];
        String crn = attributes[1];
        String section = attributes[2];
        String day = attributes[11];
        String time = attributes[12];

        return new Course(courseCode, crn, section, day, time);
    }

    /** Created by Mat, alertDialog **/
    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);

        builder.setTitle("Exit Confirmation")
                .setMessage("Are you sure?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        HomeActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("Cancel", null);
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void showdialog(View view)
    {
        //Toast.makeText(this,"clickme",Toast.LENGTH_LONG).show();
        AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(this);
        alertdialogbuilder.setMessage("1) Choose the day off options \n2) Pick the courses from list");
        AlertDialog alertdialog1=alertdialogbuilder.create();
        alertdialog1.show();
    }

    private DialogInterface.OnClickListener click1=new DialogInterface.OnClickListener()
    {
        @Override
        public void onClick(DialogInterface arg0,int arg1)
        {
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    };
    private DialogInterface.OnClickListener click2=new DialogInterface.OnClickListener()
    {@Override

    public void onClick(DialogInterface arg0,int arg1)
    {
        arg0.cancel();
    }
    };

}

