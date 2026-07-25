package com.dn5.spring.database;

import java.util.ArrayList;
import java.util.List;

import com.dn5.spring.model.Student;
import com.dn5.spring.model.Teacher;

/**
 * Database
 */
public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    ///
    /// CRUD -- Students
    ///
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

    ///
    /// CRUD -- Teachers
    ///
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public int getTeacherCount() {
        return this.teachers.size();
    }

    public boolean addTeacher(Teacher teacher) {
        return this.teachers.add(teacher);

    }

    public boolean removeTeacher(Teacher teacher) {
        return this.teachers.remove(teacher);
    }

    public Teacher getTeacherByID(int id) {
        for (Teacher each : this.teachers) {
            if (each.getId() == id)
                return each;
        }
        return null;
    }

    public Teacher updateTeacher(Teacher originalTeacher, Teacher newTeacher) {
        int index = this.teachers.indexOf(originalTeacher);
        if (index == -1)
            return null;
        return this.teachers.set(index, newTeacher);

    }

}