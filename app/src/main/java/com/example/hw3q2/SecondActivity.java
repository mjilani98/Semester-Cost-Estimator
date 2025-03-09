package com.example.hw3q2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity
{
    //Access tuition calculator in MainActivity
    private TuitionCalculator tuitionCalculator = MainActivity.tuitionCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        //display the screen
        setContentView(R.layout.activity_second);

        //update the screen
        updateView();
    }

    public void updateView()
    {
        //access the edit text , and display the values
        EditText edtNumberOfcredit = findViewById(R.id.inputNumberOfCredits);
        edtNumberOfcredit.setText(tuitionCalculator.getNumberOfCredit()+"");
    }

    //event handler for the next button
    public void next(View v)
    {
        //access the edit text and retrieve the number entered
        EditText edtNumberOfcredit = findViewById(R.id.inputNumberOfCredits);
        String strNumberOfCredits = edtNumberOfcredit.getText().toString();
        int numberOfCredit;
        try
        {
            numberOfCredit = Integer.parseInt(strNumberOfCredits);
        }
        catch (NumberFormatException e)
        {
            numberOfCredit = 0 ;
        }

        //setting the number of credits to the model
        tuitionCalculator.setNumberOfCredit(numberOfCredit);

        //display the next screen
        Intent thirdScreen = new Intent(this,ThirdActivity.class);
        startActivity(thirdScreen);
    }

    //event handler that will end the current screen
    public void back(View v)
    {
        finish();
    }


}
