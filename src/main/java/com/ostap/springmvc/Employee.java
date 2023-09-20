package com.ostap.springmvc;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    @NotBlank(message = "The field can't be empty") //@NotBlank применяется только к строкам и проверяет, что строка не пуста.
    @Size(min = 2, max = 10, message = "Name must be min 2 and max 10 symbols")
    private String name;
    @NotBlank(message = "The field can't be empty")
    @Size(min = 6, max = 15, message = "Surname must be min 6 and max 15 symbols")
    private String surname;
    @Min(value = 200, message = "Salary must be 200 USD")
    @Max(value = 7000, message = "Salary must be 7000 USD")
    private int salary;
    @NotBlank(message = "The field can't be empty")
    private String department;
    private Map<String, String> departments;

    private String carBrand;
    private Map<String, String> carBrands;
    @NotEmpty(message = ("The field can't be empty"))                                              //@NotEmpty применяется к CharSequence, Collection, Map или Array и проверяет, что он не null имеет размер больше 0.
    private String[] languages;
    private Map<String, String> languageList;
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$",
            message = "Input your number by example - 812345678901 or +712345678901 or 71234567890 or 12345678901")
    private String phoneNumber;
    public Employee() {
        departments = new HashMap<>();
        departments.put("Informational technologies", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales ", "SALES");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Lada", "LADA");
        carBrands.put("Mercedes-Benz", "MB");

        languageList = new LinkedHashMap<>();
        languageList.put("English","EN");
        languageList.put("Russian","RU");
        languageList.put("Japanese","JP");
    }
}
