package org.spring.tdprog3.controller;

import org.spring.tdprog3.entity.StudentEntity;
import org.spring.tdprog3.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/students")
    public ResponseEntity<List<StudentEntity>> addStudents(@RequestBody List<StudentEntity> students) {
        List<StudentEntity> studs = studentService.addStudents(students);
        return ResponseEntity.ok(studs);
    }

    @GetMapping("/students")
    public ResponseEntity<String> getStudents(@RequestHeader("Accept") String accept) {
        if (accept.trim().equals("text/plain")) {
            List<String> studsName = studentService.getStudents();
            return ResponseEntity.ok(studsName.toString());
        } else {
            return ResponseEntity.badRequest().body("Format non supporté");
        }

    }

}
