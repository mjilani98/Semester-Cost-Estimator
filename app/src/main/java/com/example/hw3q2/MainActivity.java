package com.example.hw3q2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static TuitionCalculator tuitionCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create a tuition calculator object
        tuitionCalculator = new TuitionCalculator();

        //display the main screen
        setContentView(R.layout.activity_main);
    }

    //event handler that will start the second scree
    public void next(View v)
    {
        //create second activity
        Intent secondActivity = new Intent(this,SecondActivity.class);

        //display the second screen
        startActivity(secondActivity);
    }
}