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
        // Just removed the gettters; don't need it now.
        // and also dont need to print getters
        student.setId(1);
        student.setName("Emily");
        student.setYearOfBirth(2005);
        print("Printing the whole student (I suppose I can call this dataclass for my sake...)");
        print(student.toString());
    }
}
