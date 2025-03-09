package com.example.hw3q2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity
{
    //Access tuition calculator in MainActivity
    private TuitionCalculator tuitionCalculator = MainActivity.tuitionCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //display the screen
        setContentView(R.layout.activity_fourth);

        //update the screen
        updateView();

    }

    //method updates the screen
    public void updateView()
    {
        //Access dormitory check box
        CheckBox dormBox = findViewById(R.id.chkBoxDromitory);

        //Access dining check box
        CheckBox diningBox = findViewById(R.id.chkBoxDining);

        //updating the check boxes
        //check values from the model
        if(tuitionCalculator.getDorms())
        {
            dormBox.setChecked(true);
        }
        else
        {

        }

        if(tuitionCalculator.getDining())
        {
            diningBox.setChecked(true);
        }
        else
        {

        }
    }

    public void next(View view)
    {
        //Access dormitory check box
        CheckBox dormBox = findViewById(R.id.chkBoxDromitory);

        //Access dining check box
        CheckBox diningBox = findViewById(R.id.chkBoxDining);

        //setting values of check boxes to the model
        //if dorm box is checked
        if(dormBox.isChecked())
        {
            tuitionCalculator.setDorm(true);
        }
        else
        {
            tuitionCalculator.setDorm(false);
        }

        //if dining box is checked
        if(diningBox.isChecked())
        {
            tuitionCalculator.setDining(true);
        }
        else
        {
            tuitionCalculator.setDining(false);
        }

        //displaying the next screen
        Intent fifthScreen = new Intent(this,FifthActivity.class);
        startActivity(fifthScreen);

    }

    //event handler ends the current scree
    public void back(View view)
    {
        //Access dormitory check box
        CheckBox dormBox = findViewById(R.id.chkBoxDromitory);

        //Access dining check box
        CheckBox diningBox = findViewById(R.id.chkBoxDining);

        //setting values of check boxes to the model
        //if dorm box is checked
        if(dormBox.isChecked())
        {
            tuitionCalculator.setDorm(true);
        }
        else
        {
            tuitionCalculator.setDorm(false);
        }

        //if dining box is checked
        if(diningBox.isChecked())
        {
            tuitionCalculator.setDining(true);
        }
        else
        {
            tuitionCalculator.setDining(false);
        }

        finish();
    }
}
