package com.laba.solvd.airport;

import com.laba.solvd.airport.exceptions.InvalidWorkingExperienceException;
import com.laba.solvd.airport.interfaces.EmployeeInformationProvider;
import com.laba.solvd.airport.interfaces.Workable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Employee extends Person implements EmployeeInformationProvider, Workable {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
    protected String employeeId;
    protected String position;
    protected int workingExperience;

    public Employee(String name, int age, String employeeId, String position, int workingExperience) {
        super(name, age);
        this.employeeId = employeeId;
        this.position = position;
        this.workingExperience = workingExperience;
        LOGGER.info("Employee with name " + getName() + " and age " + getAge()
                + " and employee id " + getEmployeeId() + " is created");
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

    public void setWorkingExperience(int workingExperience) throws InvalidWorkingExperienceException {
        if (workingExperience < 0) {
            throw new InvalidWorkingExperienceException("Working experience cannot be less than 0");
        } else {
            this.workingExperience = workingExperience;
        }

    }

    @Override
    public void displayPersonInfo() {
        LOGGER.info("Employee name " + getName());
        LOGGER.info("Employee id " + getEmployeeId());
    }

    @Override
    public int calculateYearsToRetirement() {
        int retirementAge = 65;
        int yearsToWork = retirementAge - getAge();
        return yearsToWork;
    }

    @Override
    public void work() {
        LOGGER.info(getName() + " works as " + getPosition());
    }
}
