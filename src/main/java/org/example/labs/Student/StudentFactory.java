package org.example.labs.Student;

public interface StudentFactory {
    Student createStudent(String name, String group, int numberCourse, double averageMark);
}
