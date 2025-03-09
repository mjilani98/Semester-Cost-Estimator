package com.example.hw3q2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity
{
    //Access tuition calculator in MainActivity
    private TuitionCalculator tuitionCalculator = MainActivity.tuitionCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //display the screen
        setContentView(R.layout.activity_third);

        //update the screen
        updateView();
    }

    public void updateView()
    {
        //get the academic status
        int acStatus = tuitionCalculator.getAcademicStatus();

        //access undergraduate radio button
        RadioButton undergraduateBtn = findViewById(R.id.radioBtnUnderGraduate);

        //access graduate radio button
        RadioButton graduateBtn = findViewById(R.id.radioBtnGraduate);

        //checking which radio button is checked and updating the radio buttons
        if(acStatus == R.id.radioBtnUnderGraduate)
        {
            //updating the radio button
            undergraduateBtn.setChecked(true);
            graduateBtn.setChecked(false);
        }
        else if(acStatus == R.id.radioBtnGraduate)
        {
            undergraduateBtn.setChecked(false);
            graduateBtn.setChecked(true);
        }
    }

    //event handler for the next button
    public void next(View v)
    {
        //get the academic status
        RadioGroup academicStat = findViewById(R.id.academicStatusRadioGroup);
        int acStatus = academicStat.getCheckedRadioButtonId();

        //sending the value to the model
        tuitionCalculator.setAcademicStatus(acStatus);

        //displaying fourth screen
        Intent fourthScreen = new Intent(this ,FourthActivity.class);
        startActivity(fourthScreen);
    }

    //event handler to end the current screen
    public void back(View v)
    {
        //sending the value to the model
        
        //get the academic status
        RadioGroup academicStat = findViewById(R.id.academicStatusRadioGroup);
        int acStatus = academicStat.getCheckedRadioButtonId();

        //sending the value to the model
        tuitionCalculator.setAcademicStatus(acStatus);

        finish();
    }
}
