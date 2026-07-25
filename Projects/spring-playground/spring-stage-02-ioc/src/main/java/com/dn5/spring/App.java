package com.dn5.spring;

import com.dn5.spring.database.Database;
import com.dn5.spring.repository.StudentRepository;
import com.dn5.spring.repository.TeacherRepository;
import com.dn5.spring.service.StudentService;
import com.dn5.spring.service.TeacherService;

public class App {
    public static void main(String[] args) {
        Database database = new Database();

        StudentRepository studentRepository = new StudentRepository(database);

        TeacherRepository teacherRepository = new TeacherRepository(database);

        StudentService studentService = new StudentService(studentRepository);

        TeacherService teacherService = new TeacherService(teacherRepository);

        // Admissions
        System.out.println(studentService.createNewAdmission(4, "Emily", 2007));
        System.out.println(studentService.createNewAdmission(5, "Wattson", 2007));

        // Duplicate admission
        System.out.println(studentService.createNewAdmission(3, "Paul", 2002));
        System.out.println(studentService.createNewAdmission(1, "Paul", 2004));
        System.out.println(studentService.createNewAdmission(1, "Kevin", 2005));

        // Search by name
        String name = "Paul"; // Because i created the name twice
        System.out.println(studentService.searchByName(name));

        // Search by year
        int yearOfBirth = 2007; // Obviously I created it twice too
        System.out.println(studentService.searchByYearOfBirth(yearOfBirth));

        // Count students
        System.out.println(studentService.countStudentsByYearOfBirth(yearOfBirth));

        /// ------------
        /// Teachers
        /// ------------

        // New staff
        System.out.println(teacherService.createNewStaff(4, "Emily", "English"));
        System.out.println(teacherService.createNewStaff(5, "Wattson", "Math"));

        // Duplicate staffs
        System.out.println(teacherService.createNewStaff(3, "Paul", "Science"));
        System.out.println(teacherService.createNewStaff(1, "Paul", "Biology"));
        System.out.println(teacherService.createNewStaff(1, "Kevin", "Science"));

        // Search by name
        String teacherName = "Paul"; // Because i created the teacherName twice
        System.out.println(teacherService.searchByName(teacherName));

        // Search by subject
        String subjectName = "Science"; // Obviously I created it twice too
        System.out.println(teacherService.searchBySubject(subjectName));

        // Count staffs
        System.out.println(teacherService.countTeachersBySubject(subjectName));
    }
}