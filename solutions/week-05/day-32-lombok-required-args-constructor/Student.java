package com.dn5;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Student {
    @EqualsAndHashCode.Exclude
    private final int id;
    private String name;
    private int yearOfBirth;
}
