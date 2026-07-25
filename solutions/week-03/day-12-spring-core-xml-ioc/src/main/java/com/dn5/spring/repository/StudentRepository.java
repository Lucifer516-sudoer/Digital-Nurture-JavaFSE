package com.dn5.spring.repository;

import com.dn5.spring.database.Database;
import com.dn5.spring.model.Student;
import java.util.List;

/**
 * StudentRepository
 */
public class StudentRepository {
    private final Database database;;

    public StudentRepository(Database database) {
        this.database = database;
    }

    public boolean save(Student student) {
        return database.addStudent(student);
    }

    public Student findById(int id) {
        return database.getStudentByID(id);
    }

    public List<Student> findAll() {
        return database.getAllStudents();
    }

    public boolean remove(Student student) {
        return database.removeStudent(student);
    }

}