package com.laba.solvd.airport;

import java.util.Objects;

public class Employee extends Person {

    protected String employeeId;
    protected String position;
    protected int workingExperience;

    public Employee(String name, int age, String employeeId, String position, int workingExperience) {
        super(name, age);
        this.employeeId = employeeId;
        this.position = position;
        this.workingExperience = workingExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", position='" + position + '\'' +
                ", workingExperience=" + workingExperience +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workingExperience == employee.workingExperience && employeeId.equals(employee.employeeId) && position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, position, workingExperience);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
