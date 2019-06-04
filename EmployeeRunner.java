package com.trimind.training.java07.HOME01;

import com.trimind.training.day03.Array;

import java.util.ArrayList;

public class EmployeeRunner {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Employee employee = new Employee("aru", 2015, 20000, 2000);
        employee.calculateSalary();
        System.out.println("the first employe salary  is " + employee.calculateSalary());

        Employee manager = new Employee("kotla", 2016, 22000, 2500);
        manager.calculateSalary();
        System.out.println("the second employee salary  is" + manager.calculateSalary());

        Employee clerk = new Employee("niru", 2017, 25000, 2600);
        clerk.calculateSalary();
        System.out.println("the third employee salary  is " + employee.calculateSalary());

        System.out.println("overall list of employes 1 is " + employee.toString());
        System.out.println("overall list of employee 2 is" + manager.toString());
        System.out.println("overall list of employee 3 is" + clerk.toString());

    }


}
