package com.stream;

import com.beans.Employee;
import com.interf.EmployeeData;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamSortingDemo1 implements EmployeeData{

    public static void main(String[] args) {
        //Supplier<List<Employee>> sortedEmployeeNames = EmployeeData::sortBasedOnName;
        //Supplier<List<Employee>> sortedEmployeeAge = EmployeeData::sortBasedOnAge;
        //Supplier<List<Employee>> sortedEmployeeSalary = EmployeeData::sortBasedOnSalary;

        System.out.println("Employee Details -"+EmployeeData.getEmployeeData());
        System.out.println("Employee Sort based on Name -"+EmployeeData.sortBasedOnName());
        System.out.println("Employee Sort based on Age -"+EmployeeData.sortBasedOnAge());
        System.out.println("Employee Sort based on Salary -"+EmployeeData.sortBasedOnSalary());
        System.out.println("Employee with Highest Salary -"+EmployeeData.highestSalary());
        System.out.println("Employee with Lowest Salary -"+EmployeeData.lowestSalary());
    }
}
