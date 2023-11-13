package com.laba.solvd.airport;

import java.util.Objects;

public class Employee extends Person {

    protected String employeeId;
    protected int workingExperience;

    public Employee(String name, int age, String employeeId, int workingExperience) {
        super(name, age);
        this.employeeId = employeeId;
        this.workingExperience = workingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workingExperience == employee.workingExperience && employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, workingExperience);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("Employee name " + getName());
        System.out.println("Employee id " + getEmployeeId());
    }
}
