package com.bridegelabz.empwages;

public class CalcWageUntilCondition {
    public static final int IsPartTime=1;
    public static final int IsFullTime=2;
    public static final int EmpRate=20;
    public static final int NumOfWorkingDays=2;
    public static final int MaxHrsPerMonth=10;

    public static void main(String[] args) {
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        while(totalEmpHrs <=MaxHrsPerMonth && totalWorkingDays < NumOfWorkingDays )
        {
            totalWorkingDays++;
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch(empCheck)
            {
                case IsPartTime:
                    empHrs=4;
                    break;
                case IsFullTime:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
            }
            totalEmpHrs=totalEmpHrs+empHrs;
            System.out.println("day#: "+totalWorkingDays+" Emp Hrours : "+empHrs);
        }
        int totalEmpWage=totalEmpHrs * EmpRate;
        System.out.println("Total Emp Wages : "+totalEmpWage);
    }
}
