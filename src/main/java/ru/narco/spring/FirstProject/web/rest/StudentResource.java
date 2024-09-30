package ru.narco.spring.FirstProject.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.narco.spring.FirstProject.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentResource {
    @GetMapping("/students/all")
    public ResponseEntity getAll(){
        Student student1 = new Student(7L,"Azizbek","Irmatov","2");
        Student student2 = new Student(4L,"Odiljon","Axmedov","1");
        Student student3 = new Student(12L,"Anvarjon","Gayratov","4");
        Student student4 = new Student(74L,"Asadbek","Erkinov","2");
        Student student5= new Student(1L,"Xusanboy","Xoldarboyev","2");
        Student student6 = new Student(743L,"Abdulla","Athamov","1");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        return ResponseEntity.ok(studentList);

    }

    @GetMapping("/students /{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Student student1 = new Student(id,"Azizbek","Irmatov","2");
        return ResponseEntity.ok(student1);

    }
    @PostMapping("/students")
    public ResponseEntity create(@RequestBody Student student){
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public ResponseEntity getOne(@RequestParam Long id,
                                 @RequestParam String name,
                                 @RequestParam String surName,
                                 @RequestParam String course){
        Student student = new Student(id,name,surName,course);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        return ResponseEntity.ok("Malumot ochirildi");
    }

    @PutMapping("/students/{id}")
    public ResponseEntity update(@PathVariable Long id,
                                 @RequestBody Student studentNew){
        Student student5= new Student(1L,"Xusanboy","Xoldarboyev","2");
        student5.setId(id);
        student5.setName(studentNew.getName());
        student5.setSurname(studentNew.getSurname());
        return ResponseEntity.ok(studentNew);
    }

}
