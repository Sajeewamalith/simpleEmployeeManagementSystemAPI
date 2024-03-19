package com.example.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private int empID;
    private String empName;
    private String empMNumber;
    private String empAddress;


    public Integer getEmpID() {
        return empID;
    }
}
