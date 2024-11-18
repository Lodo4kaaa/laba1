package org.example.labs;

import org.example.labs.Student.CreatorStudentFactory;
import org.example.labs.Student.StudentFactory;
import org.example.labs.StudentList.StudentList;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        StudentFactory creator = new CreatorStudentFactory();
        list.add(creator.createStudent("Bob" , "MOA" , 1 , 2));
        list.add(creator.createStudent("Maks" , "MOA" , 3 , 4.2));
        list.add(creator.createStudent("Ilia" , "MOA" , 4 , 4));
        list.add(creator.createStudent("Oleg" , "MOA" , 2 , 3));
        list.add(creator.createStudent("Vlad" , "MOA" , 2 , 2));
        list.add(creator.createStudent("Dasha" , "MOA" , 1 , 1));

        System.out.println("\nСписок студентов:");
        list.printStudent();

        System.out.println("\nСписок студентов на 2 курсе:");
        list.printStudent(2);



        list.removingStudentsWhoHaveMarkBellowThereeAndTransferForNextCourseWhoHaveMarkAboveThree();

        System.out.println("\nСписок студентов после удаления и перевода на новый крус:");
        list.printStudent();


        System.out.println("\nСписок студентов на 3 курсе после удаления и перевода на новый курс:");
        list.printStudent(3);
    }
}
