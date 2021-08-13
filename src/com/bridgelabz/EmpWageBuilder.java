package com.bridgelabz;

public class EmpWageBuilder {
     //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

        private final String company;
        private final int EMP_WAGE_PER_HOUR;
        private final int NUM_OF_WORKING_DAYS;
        private final int MAX_HRS_IN_MONTH;
        private int totalEmpWage;

	public EmpWageBuilder(String company, int EMP_WAGE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
            this.company = company;
            this.EMP_WAGE_PER_HOUR = EMP_WAGE_PER_HOUR;
            this.NUM_OF_WORKING_DAYS =NUM_OF_WORKING_DAYS ;
            this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
            this.totalEmpWage = totalEmpWage;
        }
        /**
         * This method is used to compute the employee wage
         */
        public void computeWage() {
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            /**
             * Using Math.random method to generate random numbers 0, 1 and 2
             */
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
            totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
            System.out.println("Total Wages is : " + totalEmpWage);
        }

        @Override
        public String toString() {
            return " Total Employee Wage of " + company + " : " + totalEmpWage;
        }

        public static void main(String[] args) {
            System.out.println("Welcome To Employee Wage Computation Program");
            EmpWageBuilder indiamart = new EmpWageBuilder("Indiamart", 20, 2, 10);
            EmpWageBuilder starmarket = new EmpWageBuilder("Starmarket", 10, 4, 20);
            indiamart.computeWage();
            System.out.println(indiamart);
            starmarket.computeWage();
            System.out.println(starmarket);

        }
    }




