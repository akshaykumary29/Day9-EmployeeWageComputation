package com.bridgelabz.employeewagecomputing;

/**
 * Computing Employee Wage Problem
 * Employee Wage for multiple companies
 */
public class EmployeeWage {
    // constant
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public int computeEmpWage(String company, int empRatePerHr, int numWorkingDays, int maxHrs) {

        // Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // Computationa
        while (totalEmpHrs < maxHrs && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            // System.out.println("Day:" + totalWorkingDays + " Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println(company + "\n company Total Daily Wage" +
                " for days " + totalWorkingDays + " and hours " + totalEmpHrs +
                "  is:  " + totalEmpWage + "\n");
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println(" Welcome to Employee Wage builder Problem ");
        EmployeeWage tata = new EmployeeWage();
        tata.computeEmpWage("TATA", 20, 20, 100);
        EmployeeWage hcl = new EmployeeWage();
        hcl.computeEmpWage("HCL", 25, 26, 100);
    }
}
