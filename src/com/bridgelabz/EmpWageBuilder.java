package com.bridgelabz;

public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;


    public static int computeWage() {
        // Declaring the variables
        int empHrs = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //  Using Math.random method to generate random numbers 0, 1 and 2

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0: // Employee is absent
                    empHrs = 0;
                case 1: // FullTime Employee
                    empHrs = 8;
                    break;
                case 2: // PartTime Employee
                    empHrs = 4;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR ;
        System.out.println("Total Wages is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        computeWage();

    }

}
