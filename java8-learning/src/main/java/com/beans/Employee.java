package com.beans;


public class Employee{
    private Integer id;
    private String name;
    private Integer age;
    private String designation;
    private Double salary;


    public Employee(String name,Integer age, String designation, Double salary){
        this.id = ( int ) Math.random() ;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(Integer id, String name,Integer age, String designation, Double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
