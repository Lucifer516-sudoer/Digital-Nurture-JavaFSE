package com.dn5.spring.repository;

import com.dn5.spring.database.Database;
import com.dn5.spring.model.Teacher;
import java.util.List;

/**
 * TeacherRepository
 */
public class TeacherRepository {
    private final Database database;;

    public TeacherRepository(Database database) {
        this.database = database;
    }

    public boolean save(Teacher teacher) {
        return database.addTeacher(teacher);
    }

    public Teacher findById(int id) {
        return database.getTeacherByID(id);
    }

    public List<Teacher> findAll() {
        return database.getAllTeachers();
    }

    public boolean remove(Teacher teacher) {
        return database.removeTeacher(teacher);
    }

}