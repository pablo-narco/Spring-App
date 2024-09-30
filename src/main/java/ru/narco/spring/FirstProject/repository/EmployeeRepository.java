package ru.narco.spring.FirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.narco.spring.FirstProject.domain.Employee;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndLastName(String name ,String lastName );

    List<Employee> findAllByNameLike(String name);




}
