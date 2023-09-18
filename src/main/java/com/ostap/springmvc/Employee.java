package com.ostap.springmvc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;

}
