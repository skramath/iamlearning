package com.stream;

import com.beans.Employee;
import com.beans.Person;
import com.interf.EmployeeData;
import com.mapper.PersonMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFilterDemo1 {

    //filter numbers greater than 30
    static List<Integer> getNumberGreaterThan90(List<Integer> numbers){
        return numbers.stream().filter(n -> n > 30).collect(Collectors.toList());
    }

    static List<Integer> printEvenNumber(List<Integer> numbers){
        return numbers.stream().filter(n -> n % 2 == 0).distinct().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,2,3,4,5,35,123,45,12,5);
        System.out.println("Input Numbers -"+numbers);
        Function<List<Integer>, List<Integer>> filterNumbers = StreamFilterDemo1::getNumberGreaterThan90;
        Function<List<Integer>, List<Integer>> findEvenNumber = StreamFilterDemo1::printEvenNumber;
        System.out.println("Numbers greater than 30 -"+ filterNumbers.apply(numbers));
        System.out.println("Number which are Even -"+findEvenNumber.apply(numbers));

        System.out.println("Show first 5 numbers -"+numbers.stream().limit(5).collect(Collectors.toList()));
        System.out.println("Skip first 5 numbers -"+numbers.stream().skip(5).collect(Collectors.toList()));

        List<Person> employeeNames = EmployeeData.getEmployeeData().stream()
                //.map(Employee::getName)
                //.map(employee -> new Person(employee.getName(),employee.getAge()))
                .map(PersonMapper::mapToPerson)
                .collect(Collectors.toList());
       employeeNames.forEach(a -> System.out.println(a.getName()+" - "+a.getAge()));
    }
}
