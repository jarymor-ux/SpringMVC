package com.ostap.springmvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Informational technologies", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales ", "SALES");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Lada", "Lada");
        carBrands.put("Mercedes-Benz", "MB");
    }
}
