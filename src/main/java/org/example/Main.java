package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("-------------------------------------------");

        Problem1 employeeWage = new Problem1(); // Object creation
        employeeWage.computeEmployeeWage();     // Method call

        System.out.println("-------------------------------------------");
        System.out.println("Thank You");
    }
}
