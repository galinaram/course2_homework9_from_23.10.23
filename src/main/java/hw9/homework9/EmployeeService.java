package hw9.homework9;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface EmployeeService {

    public Employee add(String firstName, String secondName, String department, double salary);

    public void remove(String firstName, String secondName, String department, double salary);

    public void find(String firstName, String secondName, String department, double salary);

    public Collection<Employee> findAll();
}