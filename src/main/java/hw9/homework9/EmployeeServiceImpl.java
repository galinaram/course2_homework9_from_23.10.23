package hw9.homework9;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    Map<String, Employee> employeesMap = new HashMap<>();
    public Employee add (String firstName, String secondName, String department, double salary) {
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            throw new RuntimeException();
        }
        employeesMap.put(employee.toString(), employee);
        return employee;
    }
    public void remove (String firstName, String secondName, String department, double salary) {
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            employeesMap.remove(employee.toString());
            return;
        }
        throw new RuntimeException();
    }
    public void find (String firstName, String secondName, String department, double salary) {
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            employeesMap.get(employee.toString());
            return;
        }
        throw new RuntimeException();
    }
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employeesMap.values());
    }

}
