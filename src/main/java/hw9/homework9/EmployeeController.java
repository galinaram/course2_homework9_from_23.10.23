package hw9.homework9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService = new EmployeeServiceImpl();
    @GetMapping
    public String test() {
        return "test";
    }
    @GetMapping("/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName, @RequestParam("department") String department, @RequestParam("salary") double salary) {

        System.out.println(firstName + " " + secondName);
        System.out.println("запускаем сервис ");
        return employeeService.add(firstName, secondName, department, salary).toString();

//        return employeeService.printEmployee(employeeService.getSize()-1);
    }
    @GetMapping("/delete")
    public String delete (@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName, @RequestParam("department") String department, @RequestParam("salary") double salary) {
        employeeService.remove(firstName, secondName, department, salary);
        return "done";
    }
    @GetMapping("/find")
    public String find (@RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName, @RequestParam("department") String department, @RequestParam("salary") double salary) {
        employeeService.find(firstName, secondName, department, salary);
        return "done";
    }
}
