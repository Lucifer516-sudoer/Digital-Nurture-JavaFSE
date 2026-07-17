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
        print(student.getId());
        print(student.getName());
        print(student.getYearOfBirth());
    }
}
