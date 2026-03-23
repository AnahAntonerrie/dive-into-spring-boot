package org.spring.tdprog3.service;

import org.spring.tdprog3.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<StudentEntity> students = new ArrayList<>();
    public List<StudentEntity> addStudents(List<StudentEntity> students) {
        this.students.addAll(students);
        return this.students;
    }
    public List<String> getStudents() {
        return students.stream().map(StudentEntity::getFirstName).toList();
    }
}
