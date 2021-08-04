package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        //constant
        int IS_PRESENT = 1;
        int EMP_WAGE_PER_HOUR = 20;
        int FULL_TIME = 8;
        int calcWage = 0;
        //calculation
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (IS_PRESENT == empcheck) {
            System.out.println("Employee is Present");
            calcWage = FULL_TIME * EMP_WAGE_PER_HOUR;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee  daily Wage = " + calcWage + " Rs ");
    }
}
