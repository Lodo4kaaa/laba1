package org.example.labs.StudentList;
import org.example.labs.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void add(Student student) {
        studentList.add(student);
    }

    public void removingStudentsWhoHaveMarkBellowThereeAndTransferForNextCourseWhoHaveMarkAboveThree () {
       studentList.removeIf(temp -> {
           if(temp.getAverageMark() < 3){
               return true;
           }
           else {
               temp.setNumberCourse(temp.getNumberCourse()+1);
               return false;
           }
       });
    }

    public void printStudent(int course) {
        for(Student temp : studentList){
            if(temp.getNumberCourse() == course){
                System.out.println(temp);
            }
        }
    }

    public void printStudent() {
        for(Student temp : studentList){
            System.out.println(temp);
        }
    }


}
