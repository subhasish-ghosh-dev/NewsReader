package com.santosoftvw.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText txtDate;
    DatePickerDialog dtPicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDate = (EditText)findViewById(R.id.editTextDate);
        txtDate.setOnClickListener(new View.OnClickListener(){
            final Calendar c = Calendar.getInstance();
            int day2 = c.get(Calendar.DAY_OF_MONTH);
            int month2 = c.get(Calendar.MONTH);
            int year2 = c.get(Calendar.YEAR);

            @Override
            public void onClick(View v) {
                dtPicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        txtDate.setText(dayOfMonth+"/"+month+1+"/"+year);
                    }
                }, year2, month2, day2);
                dtPicker.show();
            }
        });

        /*
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String curDate = sdf.format(date);
        txtDate.setText(curDate);
        */
    }
}