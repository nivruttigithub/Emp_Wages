package com.bridegelabz.empwages;

public class CalcWageForMultCompany {
    public static final int isPartTime =1;
    public static final int isFullTime =2;

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHrsPerMonth)
    {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case isPartTime:
                    empHrs=4;
                    break;

                case isFullTime:
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
        computeEmpWage("DMart" , 20 , 2 , 10);
        computeEmpWage("Reliance" , 10 , 4 , 20);
    }
}
