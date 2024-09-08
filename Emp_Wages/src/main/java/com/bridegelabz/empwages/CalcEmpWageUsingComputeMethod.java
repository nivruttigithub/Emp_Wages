package com.bridegelabz.empwages;

public class CalcEmpWageUsingComputeMethod {
    public static final int IsPartTime = 1;
    public static final int isPartTime = 1;
    public static final int isfullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfworkingDays =2;
    public static final int maxHrsInMonth = 10;

    public static int computeEmpWage()
    {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfworkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case isPartTime:
                    empHrs=4;
                    break;

                case isfullTime:
                    empHrs=8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs=totalEmpHrs+empHrs;
            System.out.println("Days# : "+totalWorkingDays+" Emp Hrs : "+empHrs);
        }
        int totalEmpWage = totalEmpHrs*empRatePerHour;
        System.out.println("Total Emp Wage : "+totalWorkingDays+" Total Emp Wage : "+totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
