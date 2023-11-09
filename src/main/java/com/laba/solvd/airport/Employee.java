package com.laba.solvd.airport;

import java.util.Objects;

public class Employee extends Person {
    private String position;
    private String employeeId;
    private String department;

    public Employee(String name, int age, String position, String employeeId, String department) {
        super(name, age);
        this.position = position;
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(position, employee.position) &&
                Objects.equals(employeeId, employee.employeeId) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, employeeId, department);
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

    @Override
    public void displayPersonInfo() {
        System.out.println("Employee name " + getName());
        System.out.println("Employee id " + getEmployeeId());
        System.out.println("Employee position" + getPosition());
    }
}
