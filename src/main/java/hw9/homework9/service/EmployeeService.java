package hw9.homework9.service;

import hw9.homework9.Employee;

import java.util.*;

public interface EmployeeService {

    Employee add(String firstName, String secondName, String department, double salary);

    void remove(String firstName, String secondName, String department, double salary);

    void find(String firstName, String secondName, String department, double salary);

    Collection<Employee> findAll();
    Collection<Employee> fullList();
}