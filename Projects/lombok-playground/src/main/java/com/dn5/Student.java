package com.dn5;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Student {
    private int id;
    private String name;
    @ToString.Exclude
    private int yearOfBirth;
}
