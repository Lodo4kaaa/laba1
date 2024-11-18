package org.example.labs.Student;

public class CreatorStudentFactory implements StudentFactory {
    @Override
    public Student createStudent(String name, String group, int numberCourse, double averageMark) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }
        if (group.isEmpty()) {
            throw new IllegalArgumentException("Группа не должны быть пустой");
        }
        if (numberCourse < 1 || numberCourse > 5) {
            throw new IllegalArgumentException("Курс не может быть меньше 1 и не может быть больше 5");
        }
        if (averageMark < 0.0 || averageMark > 5.0) { // Предположим, что оценки от 0.0 до 10.0
            throw new IllegalArgumentException("Средняя оценка не менее 0 и не более 5");
        }

        return new Student(name , group, numberCourse , averageMark);
    }
}
