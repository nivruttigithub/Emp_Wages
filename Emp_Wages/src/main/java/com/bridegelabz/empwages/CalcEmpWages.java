package com.bridegelabz.empwages;

public class CalcEmpWages {
    public static void main(String[] args) {

        int isFullTime = 1;
        int empRatePerHour = 20;
        int empHrs=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random()*10)%2;
        if(empCheck==isFullTime)
        {
            empHrs=8;
        }
        else{
            empHrs=0;
        }
        empWage=empHrs*empRatePerHour;
        System.out.println("Emp Wages : "+empWage);

    }
}
