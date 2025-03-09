package com.example.hw3q2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FifthActivity extends AppCompatActivity
{
    //Access tuition calculator in MainActivity
    private TuitionCalculator tuitionCalculator = MainActivity.tuitionCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //display the screen
        setContentView(R.layout.activity_fifth);

        updateView();
    }

    public void updateView()
    {
        //access number of credit and display
        TextView numCredit = findViewById(R.id.outputNumberOfCredits);
        numCredit.setText(tuitionCalculator.getNumberOfCredit()+"");

        //access academic status and display
        TextView academicStatus = findViewById(R.id.outputAcademicStatus);
        int academic = tuitionCalculator.getAcademicStatus();
        String strAcademic="";
        if(academic == R.id.radioBtnUnderGraduate)
        {
            strAcademic = "Undergraduate";
        }
        else if(academic == R.id.radioBtnGraduate)
        {
            strAcademic = "Graduate";
        }
        academicStatus.setText(strAcademic);

        //access optionals and display
        //access dorm
        TextView dormOuPut = findViewById(R.id.outputDorm);
        if(tuitionCalculator.getDorms())
        {
            dormOuPut.setText("Yes");
        }
        else
        {
            dormOuPut.setText("No");
        }

        //access dining
        TextView diningOutput =  findViewById(R.id.outputDining);
        if(tuitionCalculator.getDining())
        {
            diningOutput.setText("Yes");
        }
        else
        {
            diningOutput.setText("No");
        }

        //access the total cost and display
        TextView totalOutPut = findViewById(R.id.outputTotalCost);
        totalOutPut.setText(tuitionCalculator.getTotalCost()+"");


    }

    //event handler end the current screen
    public void back(View v)
    {
        finish();
    }
}
