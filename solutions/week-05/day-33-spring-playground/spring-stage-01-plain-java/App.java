package com.dn5.spring;

import com.dn5.spring.database.Database;
import com.dn5.spring.repository.StudentRepository;
import com.dn5.spring.service.StudentService;

public class App {
    public static void main(String[] args) {

        Database database = new Database();
        StudentRepository repository = new StudentRepository(database);
        StudentService service = new StudentService(repository);

        // Admissions
        System.out.println(service.createNewAdmission(4, "Emily", 2007));
        System.out.println(service.createNewAdmission(5, "Wattson", 2007));

        // Duplicate admission
        System.out.println(service.createNewAdmission(3, "Paul", 2002));
        System.out.println(service.createNewAdmission(1, "Paul", 2004));
        System.out.println(service.createNewAdmission(1, "Kevin", 2005));

        // Search by name
        String name = "Paul"; // Because i created the name twice
        System.out.println(service.searchByName(name));

        // Search by year
        int yearOfBirth = 2007; // Obviously I created it twice too
        System.out.println(service.searchByYearOfBirth(yearOfBirth));

        // Count students
        System.out.println(service.countStudentsByYearOfBirth(yearOfBirth));
    }
}