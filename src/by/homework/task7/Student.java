package by.homework.task7;

/**
 * id (тип int), name (тип String), surname (тип String),
 * faculty (факультет, тип String ), course(тип int) , Группа(тип String),
 * средняя оценка (тип int).
 */

public class Student {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private int course;
    private String group;
    private int mark;

    public Student() {
    }

    public Student(Integer studentId, String name, String surname, String faculty, int course, String groupNumber, int mark) {
        this.id = studentId;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = groupNumber;
        this.mark = mark;
    }

    public void info() {
        System.out.println("Информация о студенте: " + name + " " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Отметка: " + mark);
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public int getMark() {
        return mark;
    }

    public void setGroupMark(String group, int mark) {
        this.group = group;
        this.mark = mark;
    }

    public static Student[] getStudents(Student[] students, int mark) {

        int count = 0;
        for (Student student : students) {
            if (student.getMark() > mark) {
                count++;
            }
        }
        Student[] bestStudent = new Student[count];
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() > mark) {
                bestStudent[index] = students[i];
                index++;
            }
        }
        return bestStudent;
    }
}
