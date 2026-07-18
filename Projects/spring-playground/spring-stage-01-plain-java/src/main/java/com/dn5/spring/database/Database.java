package com.dn5.spring.database;

import java.util.ArrayList;
import java.util.List;

import com.dn5.spring.model.Student;

/**
 * Database
 */
public class Database {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public int getStudentCount() {
        return this.students.size();
    }

    public boolean addStudent(Student student) {
        return this.students.add(student);

    }

    public boolean removeStudent(Student student) {
        /// Seems I dint know this was needed, I can use the ArrayList itself
        /// Proof that I am an Agmark IDIOT 🤣
        // for (int i = 0; i < this.getStudentCount(); i++) {
        // if (students.get(i).equals(student) && students.remove(student)) {
        // return true;
        // }
        // }

        return this.students.remove(student);
    }

    public Student getStudentByID(int id) {
        for (Student each : this.students) {
            if (each.getId() == id)
                return each;
        }
        return null;
    }

    public Student updateStudent(Student originalStudent, Student newStudent) {
        int index = this.students.indexOf(originalStudent);
        if (index == -1)
            return null;
        return this.students.set(index, newStudent);

    }

}