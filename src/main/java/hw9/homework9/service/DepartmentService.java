package hw9.homework9.service;

import hw9.homework9.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    List<Employee> getDepartment (String department);
    Employee getMaxSalaryInDepartment(String department);

    Employee getMinSalaryInDepartment(String department);

    Map<String, List<Employee>> getFullDep();
}
