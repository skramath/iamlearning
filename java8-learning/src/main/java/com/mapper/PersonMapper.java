package com.mapper;

import com.beans.Employee;
import com.beans.Person;

public class PersonMapper {

    public static Person mapToPerson(Employee employee){
        return new Person(employee.getName(), employee.getAge());
    }


}
