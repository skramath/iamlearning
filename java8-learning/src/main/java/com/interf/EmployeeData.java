package com.interf;

import com.beans.Employee;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public interface EmployeeData {

    List<Employee> employees = new ArrayList<>();
    static List<Employee> getEmployeeData(){

        employees.add(new Employee("Sarath", 40, "Assosiate Manager", 300000.00));
        employees.add(new Employee("Shyam", 43, "Manager", 360000.00));
        employees.add(new Employee("Sitara", 34, "It Recruiter", 100000.00));
        //employees.add(new Employee("Devna", 34, "It Recruiter", 100000.00));
        employees.add(new Employee("Amibily", 36, "UI Developer", 250000.00));
        return employees;
    }

    static Map<String,List<String>> getEmployeeContact(){
        Map<String,List<String>> employee = new HashMap<>();
        employee.put("Sarath", Arrays.asList("34556", "sarath@accenture.com"));
        employee.put("Shyam", Arrays.asList("123456", "shyam@visa.com"));
        employee.put("Sitara", Arrays.asList("34566767", "sitara@rd.com"));
        employee.put("Devna", Arrays.asList("45644", "devna@xaviers.com"));
        employee.put("Ambily", Arrays.asList("45666", "Ambily@usa.com"));
        return employee;
    }

    //Sort based on employeeName
    static List<Employee> sortBasedOnName(){
        return employees.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
    }

    //sort based on Age
    static List<Employee> sortBasedOnAge(){
        return employees.stream().sorted((e1,e2) -> e1.getAge().compareTo(e2.getAge())).collect(Collectors.toList());
    }

    //sort based on Salary
   static List<Employee> sortBasedOnSalary(){
        return employees.stream().sorted((e1,e2) -> e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList());
    }

    //sort based on Salary
    static Optional<Employee> highestSalary(){
        return employees.stream().max(Comparator.comparing(Employee::getSalary));
    }

    //sort based on Salary
    static Optional<Employee> lowestSalary(){
        return employees.stream().min(Comparator.comparing(Employee::getSalary));
    }

}
