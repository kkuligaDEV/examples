package com.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234","John","Wick","wick@john.mail.com");
        employees.add(employeeFromDB);

        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("1234","Han","Solo","han@solo.kessel.hr");
        employees.add(new EmployeeAdapterLdap(employeeFromLDAP));

        EmployeeCSV employeeCSV = new EmployeeCSV("435,Darth,Vader,darth.vader@empire.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
