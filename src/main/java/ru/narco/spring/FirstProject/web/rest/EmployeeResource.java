package ru.narco.spring.FirstProject.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.narco.spring.FirstProject.domain.Employee;
import ru.narco.spring.FirstProject.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {

    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create (@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees")
    public ResponseEntity getAll() {
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity getAll(@PathVariable String name) {
        List<Employee> employeeList = employeeService.findByName(name);
        return ResponseEntity.ok(employeeList);
    }
}
