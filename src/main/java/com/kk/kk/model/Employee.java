package com.kk.kk.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Employee {
    @NotNull(message = "id can not be empty")
    private int id;

    private String name;

    @Min(message = "No employee without salary", value = 1)
    private double salary;

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
