package kz.dara.intensivecourse.controller;

import kz.dara.intensivecourse.model.Employee;
import kz.dara.intensivecourse.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/")
public class EmployeeController {
    
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployees(@PathVariable Long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee;
    }

    @GetMapping("/employees")
    public Employee createEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Saule");
        employee.setLastName("Zhetpisbaeva");
        employee.setEmailId("Saule@mail.ru");
        return employeeRepository.save(employee);
    }
}
