package hw9.homework9.service;

import hw9.homework9.Employee;
import hw9.homework9.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeServiceImpl employeeServiceImpl;

    public DepartmentServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }
    @Override
    public List<Employee> getDepartment(String department) {
        return employeeServiceImpl.fullList()
                .stream()
                .filter(employeesMap -> employeesMap.getDepartment().equals(department))
                .collect(Collectors.toList());
    }

    @Override
    public Employee getMaxSalaryInDepartment(String department) {
        return employeeServiceImpl.fullList()
                .stream()
                .filter(employeesMap -> employeesMap.getDepartment().equals(department))
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("Сотрудники отдела " + department + " не найдены"));
    }

    @Override
    public Employee getMinSalaryInDepartment(String department) {
        return employeeServiceImpl.fullList()
                .stream()
                .filter(employee -> employee.getDepartment().equals(department))
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new EmployeeNotFoundException("Сотрудники отдела " + department + " не найдены"));
    }

    @Override
    public Map<String, List<Employee>> getFullDep() {
        return employeeServiceImpl.fullList()
                .stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
