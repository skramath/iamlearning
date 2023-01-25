package com.stream;

import com.beans.Employee;
import com.interf.EmployeeData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFlatMapDemo3 {

    public static void main(String[] args) {
        Map<String, List<Employee>>empolyeeMap = new HashMap<>();
        empolyeeMap.put("EmployeeData", (List<Employee>) EmployeeData.getEmployeeData());
        empolyeeMap.put("SortByName", (List<Employee>) EmployeeData.sortBasedOnName());
        empolyeeMap.put("SortByAge", (List<Employee>) EmployeeData.sortBasedOnAge());
        empolyeeMap.put("SortBySalary", (List<Employee>) EmployeeData.sortBasedOnSalary());

        empolyeeMap.values().stream().flatMap(a -> a.stream()).collect(Collectors.toList()).forEach(a -> System.out.println(a));

        List<String> phones = EmployeeData.getEmployeeContact().values().stream().flatMap(a -> a.stream()).collect(Collectors.toList());
        phones.forEach(a -> System.out.println(a));




    }



}
