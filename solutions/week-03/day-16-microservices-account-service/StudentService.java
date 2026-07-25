package com.dn5.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.dn5.spring.model.Student;
import com.dn5.spring.repository.StudentRepository;

/**
 * StudentService
 */
public class StudentService {
    private final StudentRepository register;

    public StudentService(StudentRepository register) {
        this.register = register;
    }

    public boolean createNewAdmission(int id, String name, int yearOfBirth) {
        Student student = new Student(id, name, yearOfBirth);
        if (register.findById(id) == null) {
            return this.register.save(student);
        } else {
            return false;
        }
    }

    public List<Student> searchByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student each : this.register.findAll()) {
            if (each.getName().equals(name)) {
                result.add(each);
            }
        }
        return result;
    }

    public List<Student> searchByYearOfBirth(int yearOfBirth) {
        List<Student> result = new ArrayList<>();
        for (Student each : this.register.findAll()) {
            if (each.getYearOfBirth() == yearOfBirth) {
                result.add(each);
            }
        }
        return result;
    }

    public int countStudentsByYearOfBirth(int yearOfBirth) {
        return searchByYearOfBirth(yearOfBirth).size();
    }

}