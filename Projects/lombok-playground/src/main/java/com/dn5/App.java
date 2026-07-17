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
        // created three students in here itself
        Student student1 = new Student(1);
        Student student2 = new Student(2);

        print(student1.toString());
        print(student2.toString());

    }
}
