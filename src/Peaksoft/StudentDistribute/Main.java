package Peaksoft.StudentDistribute;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] arrStudent = new Student[40];
        int[] arrInt = new int[arrStudent.length];
        int w1 = 0, w2 = 0, w3 = 0, w4 = 0;
        for (int i = 0; i < arrStudent.length; i++) {
            String studentName = "Student" + (i + 1);
            int r1 = random.nextInt(16,25);
            Student student = new Student(studentName, r1);
            arrStudent[i] = student;
            int t = random.nextInt(1,5);
            arrInt[i] = t;
            if (t == 1) {
                w1++;
            } else if (t == 2) {
                w2++;
            } else if (t == 3) {
                w3++;
            } else {
                w4++;
            }
        }
        Student[] arrStud1 = new Student[w1];
        Student[] arrStud2 = new Student[w2];
        Student[] arrStud3 = new Student[w3];
        Student[] arrStud4 = new Student[w4];
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        for (int k = 0; k < arrInt.length; k++) {
            if (arrInt[k] == 1) {
                arrStud1[i1] = arrStudent[k];
                i1++;
            } else if (arrInt[k] == 2) {
                arrStud2[i2] = arrStudent[k];
                i2++;
            } else if (arrInt[k] == 3) {
                arrStud3[i3] = arrStudent[k];
                i3++;
            } else {
                arrStud4[i4] = arrStudent[k];
                i4++;
            }
        }
        Mentor mentor1 = new Mentor("Mentor1", 25);
        mentor1.addStudent(arrStud1);
        System.out.println(mentor1.toString());
        Mentor mentor2 = new Mentor("Mentor2", 27);
        mentor2.addStudent(arrStud2);
        System.out.println(mentor2.toString());
        Mentor mentor3 = new Mentor("Mentor3", 24);
        mentor3.addStudent(arrStud3);
        System.out.println(mentor3.toString());
        Mentor mentor4 = new Mentor("Mentor4", 30);
        mentor4.addStudent(arrStud4);
        System.out.println(mentor4.toString());
    }
}
