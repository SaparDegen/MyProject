package Peaksoft.StudentDistribute;

import java.util.Arrays;

public class Mentor extends Person{
    private Student[] students;

    public Mentor(String name, int age) {
        super(name, age);
    }

    void takeAnExam() {
        for (Student s: students) {
            s.explain();
        }
    }
    void addStudent(Student[] newStudents) {
        this.students = newStudents;
    }

    @Override
    public String toString() {
        return "Mentor{" + super.toString() + "} Students{" + Arrays.toString(students) + "} ";
    }
}
