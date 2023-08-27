package edu.miu.cs.cs425.demos.studentrecordsmgmtapp;

import edu.miu.cs.cs425.demos.studentrecordsmgmtapp.model.Student;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

//@SpringBootApplication
public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
       // SpringApplication.run(MyStudentRecordsMgmtApp.class, args);
        Student[] students=new Student[5];
        students[0] = new Student(110001, "Dave", LocalDate.of(1951,11,18));
        students[1] = new Student(110002, "Anna", LocalDate.parse("12/07/1990", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[2] = new Student(110003, "Erica", LocalDate.parse("01/31/1974", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[3] = new Student(110004, "Carlos", LocalDate.parse("08/22/2009", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[4] = new Student(110005, "Bob", LocalDate.parse("03/05/1990", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        printListOfAllStudents(students);
    }

    private static void printListOfAllStudents(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getName));
        System.out.println("All List of Students:");
        for (Student student:students){
            System.out.println(student);
        }
    }


}
