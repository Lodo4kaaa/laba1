package org.example.labs.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student   {

    private String name;
    private String group;
    private int numberCourse;
    private double averageMark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", numberCourse=" + numberCourse +
                ", averageMark=" + averageMark +
                '}';
    }
}
