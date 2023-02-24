package com.epam.mjc;
//"Could not find student with ID {id}"
public class CouldNotFindStudentId extends IllegalArgumentException {
    public CouldNotFindStudentId(String message) {
        super(message);
    }
}
