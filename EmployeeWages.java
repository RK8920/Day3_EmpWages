package com.bridgelabz.empwages;

public class EmployeeWages {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int FULL_TIME_HR = 8;
    public static final int PART_TIME_HR = 4;

    public static void main(String[] args) {
        int empCheck = (int) Math.floor(Math.random() * 10 % 3);
        int empHrs = 0;
        switch (empCheck) {
            case FULL_TIME:
                empHrs = FULL_TIME_HR;
                break;
            case PART_TIME:
                empHrs = PART_TIME_HR;
                break;
            default:
                empHrs = 0;
        }
        int empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Emp Wage is " + empWage);
    }
}