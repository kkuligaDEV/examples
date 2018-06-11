package com.patterns.adapter.com.patterns.adapter.interfaces;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLDAP instance;

    public EmployeeAdapterLdap(EmployeeLDAP employeeFromLDAP) {
        this.instance = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }


}
