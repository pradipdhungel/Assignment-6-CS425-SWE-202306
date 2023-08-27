
import model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//3.2.	In the package named, edu.mum.cs.cs425.demos.studentrecordsmgmtapp, add an executable Java class named, MyStudentRecordsMgmtApp.
// In the class's main method, write code that creates an array of Students, using the sample data provided above.

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        //Assume you have been tasked to build an application to be used in managing the Student records
        //// for a University and an excerpt of the students' data is given as follows:
        ////
        ////s1: studentId:110001, name:Dave, dateOfAdmission:11/18/1951
        ////s2: studentId:110002, name:Anna, dateOfAdmission:12/07/1990
        ////s3: studentId:110003, name:Erica, dateOfAdmission:01/31/1974
        ////s4: studentId:110004, name:Carlos, dateOfAdmission:08/22/2009
        ////s5: studentId:110005, name:Bob, dateOfAdmission:03/05/1990

        Student[] students=new Student[5];
        students[0] = new Student(110001, "Dave", LocalDate.of(1951,11,18));
        students[1] = new Student(110002, "Anna", LocalDate.parse("12/07/1990", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[2] = new Student(110003, "Erica", LocalDate.parse("01/31/1974", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[3] = new Student(110004, "Carlos", LocalDate.parse("08/22/2009", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        students[4] = new Student(110005, "Bob", LocalDate.parse("03/05/1990", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        printListOfAllStudents(students);
    }

    //3.3.	In the MyStudentRecordsMgmtApp class, also add a method named, printListOfStudents, which takes as input, the array
    // of students and it iterates through the objects and prints out all the students data to the console/screen. This print-out
    // should be in ascending order of the Students Names.
    // Note: Call your printListOfStudents(...) method within your MyStudentRecordsMgmtApp  class's main method, then execute it.
    private static void printListOfAllStudents(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getName));
        List<Student> platinumAlumniStudents=new ArrayList<>();
        System.out.println("All List of Students:");
        for (Student student:students){
            if(student.getDateOfAdmission().isBefore(LocalDate.now().minusYears(30))){
                platinumAlumniStudents.add(student);
            }
            System.out.println(student);

        }
        // 3.4.	Also, in the MyStudentRecordsMgmtApp class, add another method named, getListOfPlatinumAlumniStudents,
        // which takes as input, the array of all students and it returns a List of only PlatinumAlumni students.
        // A PlatinumAlumni student is a student who gained admission into the University at least 30 years ago.
        // Note: Call your getListOfPlatinumAlumniStudents(...) method within your MyStudentRecordsMgmtApp  class's main method,
        // print the list of the platinum-alumni students, in descending order of their dates of admission, then execute it.
        platinumAlumniStudents.sort(Comparator.comparing(Student::getDateOfAdmission).reversed());
    }




}
