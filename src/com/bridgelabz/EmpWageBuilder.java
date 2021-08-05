package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        //constant
        int EMP_WAGE_PER_HOUR = 20;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;

        //variables
        int calcWage = 0;
        int empHrs = 0;

        //calculation
        double empcheck = Math.floor(Math.random() * 10) % 3;

        if (IS_FULL_TIME == empcheck)
        {
            empHrs = 8;
            System.out.println("Employee is working as a Full-Time employee");  //Full time
        }
        else if (IS_PART_TIME == empcheck)
        {
            empHrs = 4;
            System.out.println("Employee is working as a Part-Time employee ");  //Part time
        }
        else
            empHrs = 0;

        calcWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Employee Wage = " + calcWage + " Rs ");
    }
}
