/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.impl;

import employee.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author urosv
 */
public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getChild(int index) {
        return employeeList.get(index);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("----------");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("----------");
        
        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

}
