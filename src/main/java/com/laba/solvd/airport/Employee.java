package com.laba.solvd.airport;

public class Employee {
    private String position;
    private String employeeId;
    private String department;
    private String name;

    public Employee(String position, String employeeId, String department, String name) {
        this.position = position;
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
