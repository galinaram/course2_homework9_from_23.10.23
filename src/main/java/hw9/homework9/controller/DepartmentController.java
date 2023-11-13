package hw9.homework9.controller;

import hw9.homework9.Employee;
import hw9.homework9.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/all")
    public Map<String, List<Employee>> getFullDep() {
        return departmentService.getFullDep();
    }

    @GetMapping(value = "/all", params = "department")
    public List<Employee> getFullDepartment(@RequestParam String department) {
        return departmentService.getDepartment(department);
    }


    @GetMapping("/max-salary")
    public Employee getMaxSalaryInDepartment(@RequestParam String department) {
        return departmentService.getMaxSalaryInDepartment(department);
    }

    @GetMapping("/min-salary")
    public Employee getMinSalaryInDepartment(@RequestParam String department) {
        return departmentService.getMinSalaryInDepartment(department);
    }
}

