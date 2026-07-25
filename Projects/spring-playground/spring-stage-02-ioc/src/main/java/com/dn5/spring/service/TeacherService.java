package com.dn5.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.dn5.spring.model.Teacher;
import com.dn5.spring.repository.TeacherRepository;

/**
 * TeacherService
 */
public class TeacherService {
    private final TeacherRepository register;

    public TeacherService(TeacherRepository register) {
        this.register = register;
    }

    public boolean createNewStaff(int id, String name, String subject) {
        Teacher teacher = new Teacher(id, name, subject);
        if (register.findById(id) == null) {
            return this.register.save(teacher);
        } else {
            return false;
        }
    }

    public List<Teacher> searchByName(String name) {
        List<Teacher> result = new ArrayList<>();
        for (Teacher each : this.register.findAll()) {
            if (each.getName().equals(name)) {
                result.add(each);
            }
        }
        return result;
    }

    public List<Teacher> searchBySubject(String subject) {
        List<Teacher> result = new ArrayList<>();
        for (Teacher each : this.register.findAll()) {
            if (each.getSubject().equals(subject)) {
                result.add(each);
            }
        }
        return result;
    }

    public int countTeachersBySubject(String subject) {
        return searchBySubject(subject).size();
    }

}