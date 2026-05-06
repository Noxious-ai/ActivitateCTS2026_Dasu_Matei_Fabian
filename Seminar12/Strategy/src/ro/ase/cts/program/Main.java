package ro.ase.cts.program;

import ro.ase.cts.clase.Grila;
import ro.ase.cts.clase.ProbaOrala;
import ro.ase.cts.clase.ProbaScrisa;
import ro.ase.cts.clase.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student(new ProbaOrala());
        students.add(student1);

        Student student2 = new Student();
        students.add(student2);

        Student student3 = new Student(new ProbaScrisa());
        students.add(student3);

        Student student4 = new Student(new Grila());
        students.add(student4);

        for(Student s: students){
            s.examinare();
        }
    }
}