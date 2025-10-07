package by.homework.task7;

import by.homework.task7.Student;
public class Main {
    public static void main(String[] args) {
        /** id (тип int), name (тип String), surname (тип String),
         * faculty (факультет, тип String ), course(тип int) , Группа(тип String),
         * средняя оценка (тип int).*/
        Student student1 = new Student(1, "Ivan", "Ivanov", "math", 2,"Math-1", 8);

        student1.info();
        student1.setGroup("Math-2");
        System.out.println(student1.getGroup());
        student1.setGroupMark("Math-3",10);
        student1.info();

        Student[] students = new Student[5];
        students[0] = new Student(1, "Petya", "Petrov", "fiz", 1,"Fiz-1", 7);
        students[1] = new Student(1, "Ola", "Kot", "inyaz", 3,"English-2", 9);
        students[2] = new Student(1, "Katya", "Petrova", "inyaz", 2,"English-2", 7);
        students[3] = new Student(1, "Nina", "Krot", "inyaz", 1,"English-1", 10);
        students[4] = new Student(1, "Masha", "Nasha", "fiz", 1,"Fiz-2", 8);

        for (int i=0; i<students.length; i++) {
            students[i].info();
        }

        Student[] bestStudent = Student.getStudents(students, 8);
        System.out.println("Лучшие студенты: " );
        for (Student student : bestStudent) {
           student.info();
        }
    }
}
