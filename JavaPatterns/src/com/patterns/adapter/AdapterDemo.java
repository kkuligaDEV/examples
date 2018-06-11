package com.patterns.adapter;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient ec = new EmployeeClient();
        List<Employee> employees = ec.getEmployeeList();

        System.out.println(employees);
    }
}
