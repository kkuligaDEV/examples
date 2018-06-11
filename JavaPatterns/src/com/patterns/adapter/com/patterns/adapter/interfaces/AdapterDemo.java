package com.patterns.adapter.com.patterns.adapter.interfaces;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient ec = new EmployeeClient();
        List<Employee> employees = ec.getEmployeeList();

        System.out.println(employees);
    }
}
