package hw9.homework9;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.*;

@Service
public class EmployeeService {
    private final Map<String, Employee> employeesMap;
    private int maxEmployees;

    public EmployeeService() {
        employeesMap = new HashMap<>();
    }
    public Employee add (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            throw new RuntimeException();
        }
        employeesMap.put(employee.getFullName(), employee);
        return employee;
    }

    public Employee remove (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            employeesMap.remove(employee.getFullName());
            return employee;
        }
        throw new RuntimeException();
    }

    public Employee find (String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        if (employeesMap.containsKey(employee.getFullName())) {
            return employeesMap.get(employee.getFullName());
        }
        throw new RuntimeException();
    }
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employeesMap.values());
    }

    public void deleteEmployee (String firstName, String secondName) {
        for (int i = 0; i < employeesMap.size(); i++) {
            Employee tmp = new Employee(employeesMap.get(i));
            if (Objects.equals(tmp.getFirstName(), firstName) & Objects.equals(tmp.getSecondName(), secondName)) {
                employeesMap.remove(i);
                System.out.println("сотрудник удалён");
            }
        }
    }
    public void findEmployee(String firstName, String secondName) {
        Employee employee = new Employee(firstName, secondName);
        for (int i = 0; i < employeesMap.size(); i++) {
            if (employeesMap.containsKey(employee.getFullName())) {
                System.out.println("сотрудник найден");
            }
        }
    }
//    public String printEmployee(int index) {
//        return employees.get(index).getFirstName() + employees.get(index).getSecondName();
//    }
}