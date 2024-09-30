package ru.narco.spring.FirstProject.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.narco.spring.FirstProject.domain.Employee;
import ru.narco.spring.FirstProject.repository.EmployeeRepository;

import java.util.List;

@Service
public class  EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Scheduled(cron = "0 2 * * * *")
    public Employee saveSchedule() {
        Employee employee1= new Employee();
        employee1.setFirstName("Azizbek");
        employee1.setLastName("Marco");
        return employeeRepository.save(employee1);
    }

}
