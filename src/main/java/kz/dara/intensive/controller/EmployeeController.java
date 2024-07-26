package kz.dara.intensive.controller;

import kz.dara.intensive.model.Employee;
import kz.dara.intensive.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class EmployeeController {
    @Autowired
    private final EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public Employee createEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Alikhan");
        employee.setSurName("Makhmed");
        employee.setEmailId("makhmed@mail.ru");
        return employeeRepository.save(employee);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return ResponseEntity.ok(employee);
    }

}
