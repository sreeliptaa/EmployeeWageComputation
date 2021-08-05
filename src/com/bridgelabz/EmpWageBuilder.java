package com.bridgelabz;

public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int empHrs = 0, calcWage = 0, totalEmpWage =0;
        // Computation
        for (int day=0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            calcWage = empHrs * EMP_WAGE_PER_HOUR;
            totalEmpWage += calcWage;
            System.out.println("Employee Daily Wage = " + calcWage + " Rs ");
        }
        System.out.println("Employee Wage for a Month = " + totalEmpWage + " Rs ");
    }
}
