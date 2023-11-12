package hw9.homework9.service;

import hw9.homework9.Employee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface EmployeeService {

    Employee add(String firstName, String secondName, String department, double salary);

    void remove(String firstName, String secondName, String department, double salary);

    void find(String firstName, String secondName, String department, double salary);

    Collection<Employee> findAll();
}