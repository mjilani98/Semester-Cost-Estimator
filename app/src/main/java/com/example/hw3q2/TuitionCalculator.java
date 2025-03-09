package com.example.hw3q2;

import android.widget.CheckBox;

public class TuitionCalculator
{

    //int numCredit, int acStatus, int stStatus, CheckBox dormBox, CheckBox parkingBox, CheckBox diningBox)
    private int numberOfCredit;
    private int academicStatus;

    private boolean dorm = false;
    private boolean dining = false;



    public int getTotalCost()
    {
       int totalCost =0;
       int creditRate = 0 ;

       //determine the academic status to determine the rate per credit
       if(academicStatus == R.id.radioBtnUnderGraduate)
       {
           creditRate = 300;
       }
       else if (academicStatus == R.id.radioBtnGraduate)
       {
           creditRate = 400;
       }

       //calculate total cost based on credit rate and number of credit
       totalCost += numberOfCredit*creditRate;

       //if student wants to add dorm

        //if students wants to add dining
        if(dining)
        {
            totalCost += 500;
        }

        //if students wants dor,
        if(dorm)
        {
            totalCost+=1000;
        }




        return totalCost;
    }

    //setting the number of credit
    public void setNumberOfCredit(int numberOfCredit)
    {
        this.numberOfCredit = numberOfCredit;
    }

    //get the number of credit
    public int getNumberOfCredit()
    {
        return numberOfCredit;
    }

    //set academic status
    public void setAcademicStatus(int academicStatus)
    {
        this.academicStatus = academicStatus;
    }

    //get academic status
    public int getAcademicStatus()
    {
        return academicStatus;
    }

    //set dorms
    public void setDorm(boolean dorm)
    {
        this.dorm = dorm;
    }

    //get dorms
    public boolean getDorms()
    {
        return dorm;
    }

    //get dining
    public boolean getDining()
    {
        return dining;
    }

    //set dining
    public void setDining(boolean dining)
    {
        this.dining = dining;
    }

}