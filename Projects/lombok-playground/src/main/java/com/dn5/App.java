package com.dn5;

public class App {
    public static void print(String data) {
        System.out.println(data);
    }

    public static void print(int data) {
        System.out.println(data);
    }

    public static void print(float data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        Student student = new Student();
        // created three students in here itself
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setId(1);
        student1.setName("Alwin");
        student1.setYearOfBirth(2005);

        student2.setId(1);
        student2.setName("Alwin");
        student2.setYearOfBirth(2005);

        student3.setId(1);
        student3.setName("Emily"); // Sweet name, isnt it?
        student3.setYearOfBirth(2005);

        print("Student 1: " + student1.toString());
        print("Student 2: " + student2.toString());
        print("Student 3: " + student3.toString());
        print("S1 == S2 :: " + student1.equals(student2));
        print("S2 == S1 :: " + student2.equals(student1));
        print("S1 == S3 :: " + student1.equals(student3));

    }
}
